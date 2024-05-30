class CanFormArray {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer,List<Integer>> temp = new HashMap<>();

        for(int i=0; i<pieces.length; i++){
            List<Integer> list1 = new ArrayList<>();
            for(int a : pieces[i]){
                list1.add(a);
            }
            temp.put(pieces[i][0], list1);
        }

        int i = 0;

        while(i < arr.length){
            if(temp.containsKey(arr[i])){
                int j = 0;
                List<Integer> list2 = temp.get(arr[i]);
                while(j < list2.size()){
                    if(list2.get(j) != arr[i]){
                        return false;
                    }
                    i++;
                    j++;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}
