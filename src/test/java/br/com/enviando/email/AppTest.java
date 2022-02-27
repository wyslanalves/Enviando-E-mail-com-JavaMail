package br.com.enviando.email;
/**
 * Unit test for simple App.
 */
public class AppTest {

	
	
	@org.junit.Test
	public void TesteEmail() throws Exception {
		
		StringBuilder stringBuilderTextoEmail = new StringBuilder();
		stringBuilderTextoEmail.append("Olá, sou<h3>WYSLAN ALVES</h3>");
		stringBuilderTextoEmail.append("Estudante Analise desenvolvimento de Sistemas, busco oportunidade para adquirir experiência podendo atuar tanto em projetos de Front-End, quanto em projetos de Back-End. Prezo sempre trabalhar em equipe, cooperando com todos e ajudando da melhor maneira possível, com grande satisfação em ensinar e aprender. Busco oportunidade profissional que permita o meu crescimento intelectual, profissional e técnico, assim podendo contribuir com ela por muito tempo, á medida que crescemos juntos.");
		
		stringBuilderTextoEmail.append("Para ter acesso clique no botão abaixo.<br/><br/>");
		stringBuilderTextoEmail.append("<a target=\"_blank\" href=\"https://www.youtube.com\" style=\"color:#2525at; padding: 14px 25px; text-align:center; text-decoration:none; display:inline-block; border-radius: 30px; font-size:20px; font-family:courier; border: 3px solid green; backgound-color:#99da39;\" >Acessar - Portfolio </a>");
		
	ObjetoEnviaEmail enviaEmail = 
			new ObjetoEnviaEmail("testejavaemail2022@gmail.com", 
								"wyslan alves - FullStack -  Spring | React", 
								"E-mail gerado com java - Api JavaMail", 
								stringBuilderTextoEmail.toString());
		
		
		
		enviaEmail.enviarEmailAnexo(true);
		enviaEmail.enviarEmail(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		try {
			/*olhe as configuraçôes smtp do seu email*/
			//Properties properties = new Properties();
			/*
			properties.put("mail.smtp.ssl.trust", "*");
			properties.put("mail.smtp.auth", "true");//Autorização
			properties.put("mail.smtp.starttls", "true");//Autenticação
			properties.put("mail.smtp.host", "smtp.gmail.com");//Servidor gmail Google
			properties.put("mail.smtp.port", "465");//Porta do servidor
			properties.put("mail.smtp.socketFactory.port", "465");//Expecifica aporta a ser conectada pelo socket
			properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");//Class socket de conexão ao SMPT
			
			Session session = Session.getInstance(properties, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				
				return new PasswordAuthentication(userName, senha);
			}
			});
			
			Address[] toUser = InternetAddress.parse("amandajussypb@gmail.com,homenxmulher@gmail.com"); 

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(userName,"Alex Jdev - Treinamneto"));// quem esta enviando
			message.setRecipients(Message.RecipientType.TO, toUser);//Email de destino
			message.setSubject("ATENÇÂO!!!");//Assunto do e-mail
			message.setText("Antes, a questão era descobrir se a vida precisava de ter algum significado para ser vivida. Agora, ao contrário, ficou evidente que ela será vivida melhor se não tiver significado.");
			
			Transport.send(message);
			
			 //Caso o email não esteja sendo enviado então Coloque um tempo esppera mais isso só
			 //pode ser usado paras
			 //Thread.Steep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		*/
		

	}
}
