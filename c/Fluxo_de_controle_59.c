#include <stdio.h>
int main(){
	

	int vet[5]={1,0,0,0,0};
	int tev[3]={1,0,0},i,j,a=1;
	
	for(i=0;i<5;i++){
		if(i%2==0){
		printf("|%d|\n|%d|\t\t|%d|\n|%d|\t  |%d|\t      |0|\n|%d|\t\t|%d|\n|%d|\n",vet[0],vet[1],tev[0],vet[2],tev[1],vet[3], tev[2],vet[4]);	
		printf("\n");
		vet[i+1]=vet[i];
		vet[i]=0;
		}else{
			for(j=0;j<3;j++){
				if(i==1){
				printf("|%d|\n|%d|\t\t|%d|\n|%d|\t  |%d|\t      |0|\n|%d|\t\t|%d|\n|%d|\n",vet[0],vet[1],tev[0],vet[2],tev[1],vet[3], tev[2],vet[4]);
				printf("\n");
				tev[j+1]=tev[j];
				tev[j]=0;
				}if(i==3){
				printf("|%d|\n|%d|\t\t|%d|\n|%d|\t  |0|\t      |%d|\n|%d|\t\t|%d|\n|%d|\n",vet[0],vet[1],tev[0],vet[2],tev[1],vet[3], tev[2],vet[4]);
				printf("\n");
				tev[j+1]=tev[j];
				tev[j]=0;
				}
				
			}
		tev[0]=1;
		tev[2]=0;
		vet[i+1]=vet[i];
		vet[i]=0;	
		}
		
	}
	
	
	
	//1 printf("|%d|\n|%d|\t\t|%d|\n|%d|\t  |%d|\t      |0|\n|%d|\t\t|%d|\n|%d|\n",vet[0],vet[1],tev[0],vet[2],tev[1],vet[3], tev[2],vet[4]);
	//2 printf("|%d|\n|%d|\t\t|%d|\n|%d|\t  |0|\t      |%d|\n|%d|\t\t|%d|\n|%d|\n",vet[0],vet[1],tev[0],vet[2],tev[1],vet[3], tev[2],vet[4]);
	//printf("  |%d|\n|%d|\n  |%d|",vet[0],vet[1],vet[2]);
	

	return 0;

}


	
	
	
	

