class Solution {
  public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
    // return (int) Math.ceil(Math.log(buckets) / Math.log(minutesToTest / minutesToDie + 1));
       int tests = minutesToTest / minutesToDie;
        int base = tests + 1;
        int pigs = 0;
        int coveredBuckets = 1;

        while (coveredBuckets < buckets) {
            coveredBuckets *= base;
            pigs++;
        }

        return pigs;
  }
}
