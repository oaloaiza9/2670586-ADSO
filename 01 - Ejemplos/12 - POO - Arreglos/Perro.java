public class Perro {

    String nombre; 
    String propietario; 
    int edad; 
    String raza; 
    double peso; 
    int energia; 
    int hambre;

    public Perro(String nombre, String propietario, int edad, String raza, double peso, int energia, int hambre){
        this.nombre = nombre; 
        this.propietario = propietario; 
        this.edad = edad; 
        this.raza = raza; 
        this.peso = peso; 
        this.energia = energia;
        this.hambre = hambre;
    }

    public void imprimir(){
        System.out.println("|-----------------------------|");
        System.out.println("|                              ");
        System.out.println("|   Nombre: "+nombre);
        System.out.println("|   Propietario: "+propietario);
        System.out.println("|   edad: "+edad+" meses");
        System.out.println("|   raza: "+raza);
        System.out.println("|   peso: "+peso+" Kg");
        System.out.println("|   energia: "+energia);
        System.out.println("|   hambre: "+hambre);
        System.out.println("|                               ");
        System.out.println("|------------------------------|");      
    }

    public String getNombre(){
        return nombre;
    }

    public String getPropietario(){
        return propietario;
    }

    public int getEdad(){
        return edad;
    }

    public String getRaza(){
        return raza;
    }

    public double getPeso(){
        return peso;
    }

    public int getEnergia(){
        return energia;
    } 

    public int getHambre(){
        return hambre;
    } 


    public void setNombre(String dato){
        nombre = dato;
    }

    public void setPropietario(String dato){
        propietario = dato;
    }

    public void setEdad(int dato){
        edad = dato;
    }

    public void setRaza(String dato){
        raza = dato;
    }

    public void setPeso(double dato){
        peso = dato;
    } 

    public void setEnergia(int dato){
        energia = dato;
    }

    public void setHambre(int dato){
        hambre = dato;
    }

    public void comer(int gramos){

        peso = peso + ((double)gramos/1000); 

        hambre = hambre - (gramos/100); 

        if(hambre==0 || hambre<0){
            System.out.println("|---------------------------------------|");
            System.out.println(" SU PERRO ESTA LLENO, NO PUEDE COMER MAS ");
            System.out.println("|---------------------------------------|");
            hambre = 0; 
        }
        if(hambre>100){
            hambre = 100; 
        }
        if(hambre>=80 && hambre<=100){
            System.out.println("|----------------------------------|");
            System.out.println(" SU PERRO TIENE HAMBRE, DELE COMIDA ");
            System.out.println("|----------------------------------|");
        }

        if(gramos<=250){
            energia = energia + (gramos/100);
        }else if(gramos>=250){
            energia = energia - (gramos/100);
        } 

        if(energia>100){
            energia = 100; 
        }
        if(energia<11){
            System.out.println("|-----------------------------------|");
            System.out.println(" SU PERRO ESTA RENDIDO DEJELO DORMIR ");
            System.out.println("|-----------------------------------|");
        }
        if(energia<=0){
            energia = 1;
        }

        if(peso<20.5){
            System.out.println("|----------------------------------------|");
            System.out.println(" SU PERRO TIENE BAJO PESO, NECESITA COMER ");
            System.out.println("|-----------------------------------------|");
        }

        if(peso>30.5){
            System.out.println("|-------------------------------------------|");
            System.out.println(" SU PERRO TIENE SOBRE PESO, NECESITA CAMINAR ");
            System.out.println("|-------------------------------------------|");
        }
    } 

    public void jugar(int minutos){

        energia = energia + (minutos/60);

        if(energia>100){
            energia = 100; 
        }
        if(energia<11){
            System.out.println("|-----------------------------------|");
            System.out.println(" SU PERRO ESTA RENDIDO DEJELO DORMIR ");
            System.out.println("|-----------------------------------|");
        }
        if(energia<=0){
            energia = 1;
        } 

        hambre = hambre + (minutos/60);

        if(hambre==0 || hambre<0){
            System.out.println("|---------------------------------------|");
            System.out.println(" SU PERRO ESTA LLENO, NO PUEDE COMER MAS ");
            System.out.println("|---------------------------------------|");
            hambre = 0; 
        }
        if(hambre>100){
            hambre = 100; 
        }
        if(hambre>=80 && hambre<=100){
            System.out.println("|----------------------------------|");
            System.out.println(" SU PERRO TIENE HAMBRE, DELE COMIDA ");
            System.out.println("|----------------------------------|");
        }
    
    }

    public void defecar(int gramos){
        peso = peso - ((double)gramos/1000); 
        if(peso<20.5){
            System.out.println("|----------------------------------------|");
            System.out.println(" SU PERRO TIENE BAJO PESO, NECESITA COMER ");
            System.out.println("|-----------------------------------------|");
        }

        if(peso>30.5){
            System.out.println("|-------------------------------------------|");
            System.out.println(" SU PERRO TIENE SOBRE PESO, NECESITA CAMINAR ");
            System.out.println("|-------------------------------------------|");
        }
    }
    
    public void dormir(int minutos){
        minutos = minutos / 60; 
        if(minutos>20 || minutos<12){
            energia = energia - minutos; 
        }else if(minutos<=20 && minutos>=12){
            energia = energia + minutos; 
        }

        if(energia>100){
            energia = 100; 
        }
        if(energia<11){
            System.out.println("|-----------------------------------|");
            System.out.println(" SU PERRO ESTA RENDIDO DEJELO DORMIR ");
            System.out.println("|-----------------------------------|");
        }
        if(energia<=0){
            energia = 1;
        } 

        hambre = hambre + (minutos/60);

        if(hambre==0 || hambre<0){
            System.out.println("|---------------------------------------|");
            System.out.println(" SU PERRO ESTA LLENO, NO PUEDE COMER MAS ");
            System.out.println("|---------------------------------------|");
            hambre = 0; 
        }
        if(hambre>100){
            hambre = 100; 
        }
        if(hambre>=80 && hambre<=100){
            System.out.println("|----------------------------------|");
            System.out.println(" SU PERRO TIENE HAMBRE, DELE COMIDA ");
            System.out.println("|----------------------------------|");
        }
    }

    public void ladrar(int ladridos){
        energia = energia - ladridos;

        if(energia<11){
            System.out.println("|-----------------------------------|");
            System.out.println(" SU PERRO ESTA RENDIDO DEJELO DORMIR ");
            System.out.println("|-----------------------------------|");
        }
        if(energia<=0){
            energia = 1;
        }
    } 

    public void caminar(int minutos){
        minutos = minutos / 60; 
        peso = peso - minutos; 
        energia = energia - minutos; 

        if(energia>100){
            energia = 100; 
        }
        if(energia<11){
            System.out.println("|------------------------------------|");
            System.out.println(" SU PERRO ESTA RENDIDO, DEJELO DORMIR ");
            System.out.println("|------------------------------------|");
        }
        if(energia<=0){
            energia = 1;
        } 

        if(peso<20.5){
            System.out.println("|----------------------------------------|");
            System.out.println(" SU PERRO TIENE BAJO PESO, NECESITA COMER ");
            System.out.println("|-----------------------------------------|");
        }

        if(peso>30.5){
            System.out.println("|-------------------------------------------|");
            System.out.println(" SU PERRO TIENE SOBRE PESO, NECESITA CAMINAR ");
            System.out.println("|-------------------------------------------|");
        } 

        hambre = hambre + (minutos/60);

        if(hambre==0 || hambre<0){
            System.out.println("|---------------------------------------|");
            System.out.println(" SU PERRO ESTA LLENO, NO PUEDE COMER MAS ");
            System.out.println("|---------------------------------------|");
            hambre = 0; 
        }
        if(hambre>100){
            hambre = 100; 
        }
        if(hambre>=80 && hambre<=100){
            System.out.println("|----------------------------------|");
            System.out.println(" SU PERRO TIENE HAMBRE, DELE COMIDA ");
            System.out.println("|----------------------------------|");
        }
  
    } 

    public void morder(int minutos){
        energia = energia + (minutos/60);

        if(energia>100){
            energia = 100; 
        }
        if(energia<11){
            System.out.println("|-----------------------------------|");
            System.out.println(" SU PERRO ESTA RENDIDO DEJELO DORMIR ");
            System.out.println("|-----------------------------------|");
        }
        if(energia<=0){
            energia = 1;
        } 

        hambre = hambre + (minutos/60);

        if(hambre==0 || hambre<0){
            System.out.println("|---------------------------------------|");
            System.out.println(" SU PERRO ESTA LLENO, NO PUEDE COMER MAS ");
            System.out.println("|---------------------------------------|");
            hambre = 0; 
        }
        if(hambre>100){
            hambre = 100; 
        }
        if(hambre>=80 && hambre<=100){
            System.out.println("|----------------------------------|");
            System.out.println(" SU PERRO TIENE HAMBRE, DELE COMIDA ");
            System.out.println("|----------------------------------|");
        }
    }



}