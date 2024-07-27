class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        List<Integer> queue = new ArrayList<>();
        List<Integer> stack = new ArrayList<>();

        for (int student : students) {
            queue.add(student);
        }
        
        for (int sandwich : sandwiches) {
            stack.add(sandwich);
        }
        int leftStudent =0;
        while (!queue.isEmpty() && leftStudent < queue.size()){

            if(queue.get(0)==stack.get(0)){
                queue.remove(0);
                stack.remove(0);
                leftStudent =0;
            }
            else{
                queue.add(queue.remove(0));
                leftStudent++;
            }
        }
    return queue.size();
    }
}