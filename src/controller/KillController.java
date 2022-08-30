package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class KillController {
	
	public KillController () {
		super();
			
	}
	
	// Retornar o S.O
	public String os() {
		String os = System.getProperty("os.name");
		return os;
	
	}
	
	
	
		
	public void listaProcessos(String process) {
		
		try {
			Process p = Runtime.getRuntime().exec(process);
			InputStream fluxo = p.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			
			while (linha !=null) {
				
				System.out.println(linha);
				linha = buffer.readLine();
				
			}
			buffer.close();
			leitor.close();
			fluxo.close();
						
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
		
	
		}
		
	public void mataPid (String paramPID) {
		String cmdPid = "TASKKILL /PID";
		int pid = 0;
		StringBuffer buffer = new StringBuffer();
		
		
		try {
			
			pid = Integer.parseInt(paramPID);
			buffer.append(cmdPid);
			buffer.append(" ");
			buffer.append(pid);
			
			
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
			
			
			
			
		}
		// callProcess
		try {
			Runtime.getRuntime().exec(buffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	public void mataNome (String paramNome) {
		String cmdNome = "TASKKILL /IM";
		StringBuffer buffer = new StringBuffer();
		
		
		try {
			
			buffer.append(cmdNome);
			buffer.append(" ");
			buffer.append(paramNome);
			
						
		} catch (NumberFormatException e) {
			e.printStackTrace();
			
			
		}
		// callProcess
		try {
			Runtime.getRuntime().exec(buffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
		
		
	}
	


