package com.google.codejam._2017.q;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class C {

    private static final Range empty = new Range(0, 0);

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 1; i <= t; i++) {

            long n = in.nextLong();
            long k = in.nextLong();

            if (n > 1000 && (k > (n*6/10))) {
                System.out.println("Case #" + i + ": 0 0");
                continue;
            }

            List<Range> ranges = new ArrayList<>(1);
            ranges.add(new Range(0, n + 1));
            k--;

            while (ranges.size() <= k) {
                List<Range> newRanges = new ArrayList<>(ranges.size() * 2);

                if (ranges.get(0).isEmptyRange()) {
                    if (k >= ranges.size()) {
                        ranges.clear();
                        ranges.add(empty);
                        k = 0;
                    }
                    break;
                }

                while (!ranges.isEmpty()) {
                    Range biggestRange = ranges.remove(0);

                    newRanges.addAll(biggestRange.getSubranges());
                    k--;
                }

                ranges = newRanges;
                Collections.sort(ranges);

            }

            System.out.println("Case #" + i + ": " + ranges.get((int) k).getMaxDistance() + " " + ranges.get((int) k).getMinDistance());

        }
    }

    private static class Range implements Comparable<Range> {

        private long first;
        private long last;
        private long index;
        private long r;
        private long l;

        Range(long first, long last) {
            this.first = first;
            this.last = last;
            this.index = (first + last) / 2;
            this.l = Long.max(index - first - 1, 0);
            this.r = Long.max(last - index - 1, 0);
        }

        long getMinDistance() {
            return Long.min(l, r);
        }

        long getMaxDistance() {
            return Long.max(l, r);
        }

        long getIndex() {
            return index;
        }

        List<Range> getSubranges() {
            List<Range> subranges = new ArrayList<>(2);
            subranges.add(new Range(first, index));
            subranges.add(new Range(index, last));

            return subranges;
        }

        boolean isEmptyRange() {
            return getMaxDistance() == 1;
        }

        @Override
        public int compareTo(Range o) {

            if (this.getMinDistance() > o.getMinDistance()) {
                return -1;
            } else if (this.getMinDistance() < o.getMinDistance()) {
                return 1;
            } else {
                if (this.getMaxDistance() > o.getMaxDistance()) {
                    return -1;
                } else if (this.getMaxDistance() < o.getMaxDistance()) {
                    return 1;
                } else {
                    if (this.getIndex() < o.getIndex()) {
                        return -1;
                    } else if (this.getIndex() > o.getIndex()) {
                        return 1;
                    } else {
                        return 0;
                    }
                }
            }
        }
    }
}
