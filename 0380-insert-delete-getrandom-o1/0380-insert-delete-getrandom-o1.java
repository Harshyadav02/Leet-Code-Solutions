class RandomizedSet {

    private HashSet<Integer> set;
    private Random random;

    public RandomizedSet() {
        set = new HashSet<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if (set.contains(val)) {
            return false;
        } else {
            set.add(val);
            return true;
        } 
    }
    
    public boolean remove(int val) {
        if (set.contains(val)) {
            set.remove(val);
            return true;
        } else {
            return false;
        } 
    }
    
    public int getRandom() {
        // Generate a random index to get a random element from the set
        int randomIndex = random.nextInt(set.size());
        
        // Convert the set to an array and return the element at the random index
        Integer[] array = set.toArray(new Integer[0]);
        return array[randomIndex];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
