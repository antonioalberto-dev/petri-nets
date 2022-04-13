#include<stdio.h>


int main(){
	int i,j;
	int t1[3]={1,0,0},t2[3]={1,0,0},p=0;

	for(i=0;i<=3;i++){
		if(i==0){
			printf("%d\t%d\n%d   %d   %d\n%d\t%d\n",t1[0],t2[0],t1[1],p,t2[1],t1[2],t2[2]);
			printf("\n");
		}else if((i>=1)&&(i<3)){
			t1[i]=t1[i-1];
			t1[i-1]=0;
			t2[i]=t2[i-1];
			t2[i-1]=0;
			printf("%d\t%d\n%d   %d   %d\n%d\t%d\n",t1[0],t2[0],t1[1],p,t2[1],t1[2],t2[2]);
			printf("\n");
		}else if(i==3){
			if(((t1[i-1])&&(t2[i-1]))!=0){
				p=t1[i-1]*t2[i-1];
				t1[i-1]=0;
				t2[i-1]=0;
			printf("%d\t%d\n%d   %d   %d\n%d\t%d\n",t1[0],t2[0],t1[1],p,t2[1],t1[2],t2[2]);
			printf("\n");
			}
			
		}
	}
	
	return 0;
}
