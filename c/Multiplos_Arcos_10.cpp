#include<stdio.h>

void vetor(int x){
	int vetor[3];
	for(x=0;x<=2;x++){
		printf("Informe o valor: ");
		scanf("%d",&vetor[x]);
}


}
int main(){
	int x=0;
	
	do{
		printf("qual posicao ocupar : ");
		scanf("%d",&x);
		vetor(x);
		
		if((x!=1)&&(x!=2)){
			printf("Local [%d] do vetor ocupado \n",x,vetor[x]);
			printf("Locais [1] e [2] livres \n");
		}
		
		if((x!=0)&&(x!=2)){
			printf("Local [%d] do vetor ocupado \n",x);
			printf("Locais [0] e [2] livres \n");
		}
		
		
		if((x!=1)&&(x!=0)){
			printf("Local [%d] do vetor ocupado \n",x);
			printf("Locais [0] e [1] livres \n");
		}
		
		
	}while((x>=0)&&(x<=2));
	
	
	
	//printf("Valor de x: %d",x);
	/*for(x=0;x<=2;x++){
		printf("[%d] ",vetor[x]);
	}*/
return 0;
}
