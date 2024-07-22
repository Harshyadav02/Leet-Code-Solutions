class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));;
        int kthClosestPoints[][] = new int[k][2];
        Arrays.stream(points).forEach(arr->{

            int sum = Arrays.stream(arr).map(ele -> ele*ele).sum();
            pq.add(new int[]{sum, arr[0], arr[1]});
        });

        // pq.forEach(point -> System.out.println(Arrays.toString(point)));

        for (int i = 0; i < k; i++) {
            int[] closest = pq.poll();
            kthClosestPoints[i] = new int[]{closest[1], closest[2]};
        }

        return kthClosestPoints;
    }
}