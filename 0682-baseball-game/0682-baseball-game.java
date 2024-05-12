class Solution {
    public int calPoints(String[] operations) {

        ArrayList<Integer> list = new ArrayList<>();
        int sumOfScore = 0;
        int length = operations.length;
        for(int index=0; index<length; index++){
            String element = operations[index];
            
            if(operations[index].equals("C")){
                list.remove(list.size()-1);
            }
            else if(operations[index].equals("D")){
                list.add((list.get(list.size()-1)*2));
            }
            else if(operations[index].equals("+")){
                list.add((list.get(list.size()-1) + list.get(list.size()-2)));
            }
            else{
                list.add(Integer.valueOf(operations[index]));
            }
        }

        for(int index=0; index<list.size(); index++){

            sumOfScore += list.get(index);
        }
        return sumOfScore;
    }
}