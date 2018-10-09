#include <iostream>
#include <iomanip>
#include <string.h>
#include <stdlib.h>
#include <string>
#include<fstream>
#include <stdio.h>
#include <windows.h>

using namespace std;

struct productos {
	string nombre;
	float precio;
	int cantidad;
	int vendidos;
} p[6] ;

struct distribuidor{

    char nombre[20];
    char ciudad[30];
}distribuidores [100];

struct producto{

    char nombre[20];
    int codigo;
    float valor;
}productos [50];
  
void asignar_valores () {	
	p[0].nombre = "Cuadernos", p[0].precio = 1.50, p[0].cantidad = 100, p[0].vendidos = 0;
	p[1].nombre = "Lapices", p[1].precio = 0.65, p[1].cantidad = 100, p[1].vendidos = 0;
	p[2].nombre = "Carpetas", p[2].precio = 0.30, p[2].cantidad = 100, p[2].vendidos = 0;
	p[3].nombre = "Mochilas", p[3].precio = 21.99, p[3].cantidad = 100, p[3].vendidos = 0;
	p[4].nombre = "Calculadoras", p[4].precio = 30.99, p[4].cantidad = 100, p[4].vendidos = 0;
	p[5].nombre = "Borradores", p[5].precio = 0.25, p[5].cantidad = 100, p[5].vendidos = 0;
}
  
struct vendedores {
	int id;
	char nombre[50];
} vendedores[100] ;

void error () {
	system("cls");
	printf("\n\n\n\n\n\t\t\t\tOPCION NO VALIDA\n\n\n\n\n");
	system("pause");
}

struct pedido{

    char nombre[20];
    int codigo;
    int cantidad;
}pedidos [100];

void lectura(){
	ifstream archivo;
	string texto;
	archivo.open("PEDIDO.txt",ios::in);
	if(archivo.fail()){
		cout<<"No se puede abrir el archivo";
		exit(1);
	}
	cout<<setw(23)<<"Producto ||"<<setw(12)<<"Codigo |"<<setw(12)<<"cantidad |"<<endl;
	printf("          ===========||===========|===========|\n");
	while(!archivo.eof()){
		
		getline(archivo,texto);
		cout<<texto<<endl;
	}
	archivo.close();
	}
	void lectura_distribuidor(){
	ifstream archivo;
	string texto;
	archivo.open("DISTRIBUIDORES.txt",ios::in);
	if(archivo.fail()){
		cout<<"No se puede abrir el archivo";
		exit(1);
	}
	cout<<setw(23)<<"Distribuidor ||"<<setw(12)<<"Ciudad"<<endl;
	printf("        =============||=============\n");
	while(!archivo.eof()){
		
		getline(archivo,texto);
		cout<<texto<<endl;
	}
	archivo.close();
	}

void escribir_distribuidor(){
	int op,i=0,a,num,j=0;
	ofstream archivo;
	archivo.open("DISTRIBUIDORES.txt",ios::out | ios::app);
	if(archivo.fail()){
		printf("no se pudo abrir el archivo");
		exit(1);
	}           	
                    i++;
                    printf("\nDISTRIBUIDOR %d\n\n",i);
                    printf("NOMBRE: ");
                    fflush(stdin);
                    gets(distribuidores[i].nombre);
                    archivo<<setw(20)<<distribuidores[i].nombre<<" ||";
                    fflush(stdin);
                    printf("CIUDAD: ");
                    gets(distribuidores[i].ciudad);
                    archivo<<setw(10)<<distribuidores[i].ciudad<<endl;
                    fflush(stdin);
                    printf("\nINGRESO DE DISTRIBUIDOR FINALIZADO\n");
        			system("pause");
                    
        archivo.close();
     }
void escribir(){
	int op,i=0,a,num,j=0;
	ofstream archivo;
	archivo.open("PEDIDO.txt",ios::out | ios::app);
	if(archivo.fail()){
		printf("no se pudo abrir el archivo");
		exit(1);
	}
	do{
        	system("cls");
        
                printf("\t\t\tPEDIDOS\n\n");
                printf("1.Solicitar Pedidos\n2.Mostrar Pedidos\n3.Regresar");
                printf("\n\nSeleccione una opcion: ");
                scanf("%d",&op);
                fflush(stdin);
            switch (op){
            	
                case 1:
                	system("cls");
                    printf("\t\tINGRESO DE PEDIDOS\n");
                    do{
                    i++;
                    printf("\nPRODUCTO %d\n\n",i);
                    printf("NOMBRE: ");
                    gets(pedidos[i].nombre);
                    archivo<<setw(20)<<pedidos[i].nombre<<" ||";
                    printf("CODIGO: ");
                    scanf("%d",&pedidos[i].codigo);
                    archivo<<setw(10)<<pedidos[i].codigo<<" |";
                    fflush(stdin);
                    printf("CANTIDAD: ");
                    scanf("%d",&pedidos[i].cantidad);
                    archivo<<setw(10)<<pedidos[i].cantidad<<" |"<<endl;
                    fflush(stdin);
                    printf("\t\nDesea ingresar otro pedido:\n");
                    printf("1. SI\n");
                    printf("2. NO\n");
                    scanf("%d",&a);
                    fflush(stdin);
                    }while(a==1);
                    printf("\nINGRESO DE PEDIDOS FINALIZADO\n");

        			system("pause");
                    break;
                    
                case 2:
                    
                    system("cls");
					lectura();
                   	system("pause");
                    break;
                }        		
        }while(op!=3);
        archivo.close();
     }


int main () {
	
	asignar_valores ();
	
	int i;
	int c,d,e,f,g;
	int n;
	int v=0;
	char temp[50];
	float x,y;
	
	do 
	{
		c = 0;
		system("cls");
		
		printf("\t\t\t-----------------");
		printf("\n\t\t\tPROYECTO FINAL");
		printf("\n\t\t\t-----------------");
        printf("\n\n\n\n\t\t\tINGRESAR......1");
        printf("\n\t\t\tSALIR.........2");
        printf("\n\n\t\t\tIngrese opcion:\t");
        
		scanf("%d",&n);
		
		if (n==1) 
		{
			do
			{
				d = 0;
				system("cls");
				
				printf("\n\t\t\tMENU PRINCIPAL");
                printf("\n\t\t\t--------------");
                printf("\n\n\tAdministrador.......1");
                printf("\n\tVendedor............2");
                printf("\n\tConsultar precios...3");
                printf("\n\tRegresar............4");
                printf("\n\n\t\tIngrese opcion:\t");
                
                scanf("%d",&n);
                
                switch (n)
                {
                	case 1:
                        do
						{
							e = 0;
                            system("cls");
                            
                            printf("\n\t\t\tMENU ADMINISTRADOR");
                            printf("\n\t\t\t------------------");
                            printf("\n\n\tNuevo distribuidor............1");
                            printf("\n\tVer lista de distribuidores....2");
                            printf("\n\tRevisar bodega............3");
                            printf("\n\tGanancia total............4");
                           	printf("\n\tGenerar pedido............5");
                            printf("\n\tRegresar..................6");
                            printf("\n\n\t\tIngrese opcion:\t");
                            
                            scanf("%d",&n);
                            
                            switch (n)
                            {
                            	case 1:
                            		do
                            		{
	                            		f = 0;
	                            		system("cls");
	                            		
										printf("\n\t\t\tNUEVO DISTRIBUIDOR");
	                            		printf("\n\t\t\t--------------");
	                            		escribir_distribuidor();
	                            		
										system("cls");
	                            		
										printf("\n\tConfirma que desea guardar al nuevo distribuidor?",temp);
	                            		printf("\n\n\tConfirmar.......1");
	                            		printf("\n\tModificar.......2");
	                            		printf("\n\tCancelar........3");
	                            		printf("\n\n\t\tIngrese opcion:\t");
	                            		
	                            		scanf("%d",&n);
	                            		
	                            		switch (n)
	                            		{
	                            			case 1:
		                            			strcpy (vendedores[++v].nombre,temp);
												vendedores[v].id = v;	
												f = 1;
												break;
											case 2:
												break;
											case 3:
												f = 1;
												break;
											default:
			                            		error;
										}
                            		} while (f==0);
                            		break;
                            	case 2:
                        			system("cls");
                        			printf("\n\t\t\tLista de Distribuidores");
                        			printf("\n\t\t\t------------------\n\n\n");
                            		lectura_distribuidor();
									printf("\n\n\n\n\n");
									system("pause");
									break;
								case 3:
                        			system("cls");
                        			printf("\n\t\t\t\tBodega");
                        			printf("\n\t\t\t\t------\n\n\n\n");
                        			cout<<setw(23)<<"Producto ||"<<setw(12)<<"Cantidad |"<<setw(12)<<"Vendidos |"<<endl;
                        			printf("          ===========||===========|===========|\n");
                        			for (i=0 ; i<6 ; i++) {
                        				cout<<setw(20)<<p[i].nombre<<" ||"<<setw(10)<<p[i].cantidad<<" |"<<setw(10)<<p[i].vendidos<<" |"<<endl;
									}
									for (i=0 ; i<6 ; i++) {
										if(p[i].cantidad<=10){
										printf("\n\t\t**** ALERTA ****\n");												
		                        		cout<<endl<<setw(20)<<"El producto: *"<<p[i].nombre<<"* se esta agotando, cantidad disponible: "<<p[i].cantidad<<endl;
										printf("***DESEA GENERAR PEDIDO AHORA?:***\n");
										printf("1. SI\n0. NO");
										}
									}

                            		printf("\n\n\n\n\n");
									system("pause");	
									break;
								case 4:
									system("cls");
									printf("\n\t\t\tGanancias");
									printf("\n\t\t\t---------\n\n\n");
									x = 0;
									for (i=0 ; i<6 ; i++) {
										x = x + p[i].vendidos*p[i].precio;
									}
									printf("\tGanancias TOTALES = $ %.2f\n\n\n\n\n",x);
									system("pause");
								case 5:
									system("cls");
									printf("\n\t\t\t PEDIDO");
                            		printf("\n\t\t\t-------------\n\n\n");
                            		for (i=1 ; i<=v ; i++) {
                            		printf("    ");
                            		cout<<setw(20)<<vendedores[i].nombre<<"....."<<i<<endl;
									}
									printf("\n\t");
									cout<<setw(22)<<"Regresar.....0"<<endl;
									printf("\n\n\t\tIngrese opcion:\t");
									scanf("%d",&n);
									if (n>=1 && n<=v+1) {
										escribir();
										}
									break;
                            	case 6:
                            		e = 1;
                            		break;
                            	default:
                            		error ();
							}
                        }
                        while (e==0);
                        break;
                    case 2:

							system("cls");
							printf("\n\t\t\tMENU VENDEDOR");
                           printf("\n\t\t\t-------------\n\n\n");
								do
								{
									f = 0;
									system("cls");
									printf("\n\t\t\tMENU VENDEDOR");
                          		    printf("\n\t\t\t-------------\n\n");
                          		    printf("\n\tVender....................1");
                          		    printf("\n\tRevisar bodega............2");
                          		    printf("\n\tRegresar..................3");
                          		    printf("\n\n\t\tIngrese opcion:\t");
									scanf("%d",&n);
									switch (n)
									{
										case 1:
											system("cls");
											printf("\n\t\t\tVender");
											printf("\n\t\t\t------\n\n\n");
											for (i=0 ; i<6 ; i++) {
												cout<<setw(20)<<p[i].cantidad<<"  "<<p[i].nombre<<endl;
											}
											printf("\n");
											x = 0;
											for (i=0 ; i<6 ; i++) {
												cout<<p[i].nombre<<" x ";
												scanf("%f",&y);
												if(y<=100){
												
												x = x + y*p[i].precio;
												p[i].cantidad -= y;
												p[i].vendidos += y;
											}else{
												printf("\n\t\t**NO HAY STOCK DE PRODUCTOS**\n\n");
											}
											}
											printf("\n\tEsta venta = $ %.2f\n\n\n\n\n",x);
											system("pause");
											break;
										case 2:
											system("cls");
		                        			printf("\n\t\t\t\tBodega");
		                        			printf("\n\t\t\t\t------\n\n\n\n");
		                        			cout<<setw(23)<<"Producto ||"<<setw(12)<<"Cantidad |"<<setw(12)<<"Vendidos |"<<endl;
		                        			printf("          ===========||===========|===========|\n");
		                        			for (i=0 ; i<6 ; i++) {
		                        				cout<<setw(20)<<p[i].nombre<<" ||"<<setw(10)<<p[i].cantidad<<" |"<<setw(10)<<p[i].vendidos<<" |"<<endl;
											}
											for (i=0 ; i<6 ; i++) {
												if(p[i].cantidad<=10){
												printf("\n\t\t**** ALERTA ****\n");												
		                        				cout<<endl<<setw(20)<<"El producto: *"<<p[i].nombre<<"* se esta agotando, cantidad disponible: "<<p[i].cantidad<<endl;
											}
											}
		                            		printf("\n\n\n\n\n");
											system("pause");	
											break;
										case 3:
											f = 1;
											break;
										default:
											error ();
									}
								}
								while (f==0);  
						break;
					case 3:
						system("cls");
						printf("\n\t\t\tLista de precios");
						printf("\n\t\t\t----------------\n\n\n");
						for (i=0 ; i<6 ; i++) {
							printf("\t");
							cout<<setw(20)<<p[i].nombre<<"..... $ ";
							printf("%.2f\n",p[i].precio);
						}
						printf("\n\n\n\n\n");
						system("pause");
						break;
					case 4:
						d = 1;
						break;
					default:
						error ();
				}
			}
			while (d==0);	
		}
		else if (n==2)
		{
			c = 1;
		}
		else
		{
			error ();
		}
	} 
	while (c==0);
	
	system("cls");
	printf("\n\n\n\n\n\t\t\t\t!! ADIOS !!\n\n\n\n\n");
	
	return 0;
}
