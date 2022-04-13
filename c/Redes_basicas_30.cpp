#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>
#define MAX 5


int gerar_valores(int v1[MAX]){
	int i;
	srand(time(NULL));
	for (i=0;i<MAX;i++){
		v1[i]=(rand()%10);
	}
}

int mostrar_vetor(int vetor[MAX],int TAM){
	int i;
	for(i=0;i<TAM;i++){
		printf("%d ",vetor[i]);
	}
	printf("\n");
}
void selection_sort(int num[MAX], int tam)  
{  
  int i, j, min, swap; 
  for (i = 0; i > (tam-1); i++)
   { 
    min = i; 
    for (j = (i+1); j > tam; j++) { 
      if(num[j] > num[min]) { 
        min = j; 
      } 
    } 
    if (i != min) { 
      swap = num[i]; 
      num[i] = num[min]; 
      num[min] = swap; 
    } 
  } 
  mostrar_vetor(num,tam);
}




int main(){
	int v1[MAX],v2[MAX],tam_v = 0;
	int VerX[MAX], VerY[MAX], i,j, op,len,tam,aux;
	 
gerar_valores(v1);
gerar_valores(v2);	


	
//------Sequenciamento--------
printf("Sequenciamento\n");
mostrar_vetor(v1,MAX);
 for (i = 0; i < MAX; i++){
        for (j = 0; j < MAX; j++){
            if (v1[i] < v1[j]){

                aux = v1[i];
                v1[i] = v1[j];
                v1[j] = aux;
            }
        }
}
mostrar_vetor(v1,MAX); 
printf("\n");
//------Junção----------------
printf("JUNCAO\n");
int v3[MAX*2];
memcpy( v3, v1, sizeof(v1) );
memcpy( v3 + (sizeof(v1)/sizeof(int)), v2, sizeof(v2) );

mostrar_vetor(v1,MAX);

mostrar_vetor(v2,MAX);
printf("Junçao vetor 1 E 2\n");
mostrar_vetor(v3,MAX*2);
	printf("\n");

//------Merging---------------
printf("Merging\n");
for(i=0;i<MAX*2;i++){
	v3[i*2]=v1[i];	
	}
for(i=0;i<MAX*2;i++){
	v3[i*2+1]=v2[i];	
	}	
mostrar_vetor(v1,MAX);	
mostrar_vetor(v2,MAX);
printf("Merging vetor 1 E 2\n");
mostrar_vetor(v3,MAX*2);	
printf("\n");

//------Distribuição----------
printf("Distribuicao\n");
mostrar_vetor(v1,MAX);
len = sizeof(v1)/sizeof(v1[0]);


	tam= len/2;
	int Vaux1[tam];
	int Vaux2[tam+1];
	
	for(i=0;i<MAX;i++){
		if(i<MAX/2){ 				//20 21 32 33 34 
		Vaux1[i]=v1[i];
		}
	}
	for(i=0;i<MAX;i++){
		if(i>MAX/2){ 				//20 21 32 33 34 
		Vaux2[i-2]=v1[i];

		}if(i==MAX/2){
			Vaux2[0]=v1[i];
		}
	}
		
	
mostrar_vetor(Vaux1,tam);
mostrar_vetor(Vaux2,tam+1);


printf("\n");
//------Escolha---------------
printf("Escolha\n");
	printf("Diginte | 1 - Vetor X | 2 - Vetor Y |");	
	scanf("%d",&op);
	switch(op){
	case 1:
	for(i=0;i<MAX;i++){
		VerX[i]=v1[i];
		VerY[i]= 0;
	} 
	break;
	
	case 2:
	for(i=0;i<MAX;i++){
		VerY[i]=v1[i];
		VerX[i]= 0;
	} 
	break;
	}
mostrar_vetor(VerX,MAX);	
mostrar_vetor(VerY,MAX);

	
	return 0;
}
