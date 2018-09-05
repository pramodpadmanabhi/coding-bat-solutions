/* reverse3
	
		Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

		*/

		public int[] reverse3(int[] nums) {
  int[] intArray=new int[3];
  int reduce=nums.length;
  for(int i=0;i<nums.length;i++)
  {
    
    intArray[i]=nums[reduce-1];
    reduce--;
    
  }
  return intArray;
}