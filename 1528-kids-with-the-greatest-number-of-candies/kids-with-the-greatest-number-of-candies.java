class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        // Find the maximum number of candies among all the kids by iterating through the candies array
        int maxCandies = 0;
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }
        
        List<Boolean> result = new ArrayList<>();
        
        // Iterate through the candies array again and check for each kid if they can have the greatest number of candies 
        // by adding extraCandies to their candies and comparing it to the maximum number of candies.
        for (int candy : candies) {
            if (candy + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        
        return result;
    }
}
