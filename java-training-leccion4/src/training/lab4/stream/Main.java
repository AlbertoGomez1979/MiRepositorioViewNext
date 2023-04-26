package training.lab4.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import training.lab4.stream.Vehiculo.Modelo;

//Stream Son secuencias de objetos que se pueden aplicar a ciertas operaciones
//Operaciones intermedias para ordenar, filtrar , agrupar , distinct
//Operaciones terminales como ForEach, Collect , Reduce

public class Main {

	public static void main(String[] args) {
		
		List<Vehiculo> vehiculos = new ArrayList<>();

		vehiculos.add(new Vehiculo("111aaa", Modelo.CITROEN, 250000));
		vehiculos.add(new Vehiculo("23442ddd", Modelo.AUDI, 30000));
	
		//proyeccion del campo kilometros, valor inicial
		List<Integer> result2 = vehiculos.stream()
				.map(Vehiculo::getKilometros)//BUSCA ESTE METODO EN LA CLASE VEHICULO
				.collect(Collectors.toList());//MUESTRALO POR EL METODO TOLIST
		
		System.out.println("MAP Proyeccion: " + result2);
		
		
		//SE USA EL MAP PARA MODIFICAR LOS VALORES
		//SE MULTIPLICA LOS KLM POR 2
		List<Integer> result = vehiculos.stream()
					.map(v -> v.getKilometros()*2)
					.collect(Collectors.toList());
				
		System.out.println("Map: " + result);
		
		
		//FILTER-> FILTRAMOS LOS ELEMENTOS A PARTIR DE UNA CONDICION
		List<Vehiculo> result3 = vehiculos.stream()
				.filter(v -> v.getModelo().equals(Modelo.AUDI))
				.collect(Collectors.toList());
		
		System.out.println("Filtro: " + result3);
		
		
		//Sorted -> Ordena elementos
		List<Vehiculo> result4 = vehiculos.stream()
				.sorted((v1, v2) -> Integer.compare(v1.getKilometros(), v2.getKilometros()))
				.collect(Collectors.toList());
				
				System.out.println("Ordenamiento: " + result4);
	
				
				
		//Disctinct -> Distintos segun modelo
		List<Modelo> result5 = vehiculos.stream()
				.map(Vehiculo::getModelo)
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println("Distinto: " + result5);
		
		//Foreach -> Recorre cada elemento
		vehiculos.parallelStream()
		        .limit(4)
		        .forEach(System.out::println);
		vehiculos.stream().forEach(System.out::println);

		
		//Collect -> agrupar por modelo
		Map<Modelo, List<Vehiculo>> groupByModel = vehiculos.parallelStream()
				.collect(Collectors.groupingBy(Vehiculo::getModelo));
			
		//System.out.println("Agrupamientos : " + groupByModel);
		
		//reduce -> suma todos los kilometros de todos los vehiculos
		Integer result7 = vehiculos.stream()
			.map(v -> v.getKilometros())
			.reduce(0, Integer::sum);
		
		System.out.println("Total kilometros: " + result7);
	}

}
