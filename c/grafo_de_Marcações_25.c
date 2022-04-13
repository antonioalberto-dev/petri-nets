#include <stdio.h>
#include <windows.h>
int main(){
int t=1;
while(t < 6){
	if(t == 1){
		printf("p1->p2(x) ");
		Sleep(1000);
		t++;
	
	if( t == 2 ){
			Sleep(1000);
			printf("p2->p3 p2->p7 ");
			t++;
		}
		if( t == 3 ){
			Sleep(1000);
			printf("p3->p1 ");
			t++;
		}
			if( t == 4 ){
				Sleep(1000);
			printf("p4(x)->p5 ");
			t++;
		}
			if( t == 5 ){
				Sleep(1000);
			printf("p5->p6 p5->p7 ");
			t++;
		}
			if( t == 6 ){
				Sleep(1000);
			printf("p6->p4(x)");
			t++;
		}
	}
	}
}


	
	
	
	

