class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        if(image==null || image.length==0){
            return image;
        }
        for(int i=0; i<image.length;i++){
            int count=0; int k=image[i].length-1; int j=0;
            while(k >=0 && j<=k){
                int temp = image[i][k];
                image[i][k] = (image[i][j]==1)?0:1;
                image[i][j] = (temp==1)?0:1;
                k--;j++;  
                }
            j=count;
        }
        return image;
    }
}
