#include<stdio.h>
#define MAX 4
#define CAIXA 1
int main(){
	int Pacote[MAX][1][3],i,j,k, cont,c, parafusos=0,porca=0,embalagem=0;
	
for(c=0;c<CAIXA;c++){	 
	 for(i=0;i<MAX;i++){
	 	for(j=0;j<1;j++){
	 		for(k=0;k<3;k++){
	 			if(k==0){
	 				Pacote[i][j][k]=3;
	 				printf("Parafusos[%d] ",Pacote[i][j][k]);
	 				 parafusos+=3;
				}else if(k==1){
					Pacote[i][j][k]=3;
					printf("Porcas[%d] ",Pacote[i][j][k]);
					 porca+=3;
				}else if(k==2){
					Pacote[i][j][k]=1;
					printf("Embalagem[%d] ",Pacote[i][j][k]);
					 embalagem+=1;
				}
	 			
			}
			printf("\n");
		 }
	
		printf("total de Parafusos: %d\n",parafusos);
		printf("total de Porcas: %d\n",porca);
		printf("total de Embalagem: %d\n",embalagem);
		printf("total de pacotes enviados: %d",i+1);
		printf("\n\n");
	 }
	 cont++; 
}
	printf("total de pacotes no deposito: %d",cont);
	return 0;
}
