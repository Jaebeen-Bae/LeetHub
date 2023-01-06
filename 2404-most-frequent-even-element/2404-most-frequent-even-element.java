class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer>numberCounts =new HashMap<>();
        int result=-1 ,maxFreq=-1;
        for(int num:nums)
            if(num%2==0)                    
                numberCounts.put(num,numberCounts.getOrDefault(num,0)+1);                                               
            
            
        for(Integer num:numberCounts.keySet()){      
            if(numberCounts.get(num)>maxFreq){
                maxFreq=numberCounts.get(num);
                result=num;
            }
            else if(numberCounts.get(num)==maxFreq && result>num)
                result=num;                        
                                
        }
        return result;                
    }
}