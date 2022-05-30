package pdfgeneration;

import java.io.FileNotFoundException;  
import java.io.FileOutputStream;
import java.util.Scanner;

import com.itextpdf.text.Document;  
import com.itextpdf.text.DocumentException;  
import com.itextpdf.text.Paragraph;  
import com.itextpdf.text.pdf.PdfWriter;  

public class GeneratePdf  
{  

	public static void main(String args[])  
{  
//created PDF document instance   
Document doc = new Document();  
try  
{  
//generate a PDF at the specified location  
PdfWriter writer = PdfWriter.getInstance(doc, new FileOutputStream("C:\\Users\\Rajesh\\Desktop\\BikeService.pdf"));  
System.out.println("Hi, please enter the following details:");  
System.out.print("Can I know your name please: ");  
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();
System.out.print("Thankyou. Enter your Bike Reg. no: ");
String bikeregno = sc.nextLine();

//opens the PDF  
doc.open();  
//adds paragraph to the PDF file  
doc.add(new Paragraph("Hi "+name+", Welcome to Royal Enfield Service Station."));   
doc.add(new Paragraph("Your Bike registration number is "+bikeregno+" and it will be serviced and ready by evening 6.00pm. Please arrange for collection accordingly. Thankyou."));   
//close the PDF file  
doc.close();  
//closes the writer  
writer.close();  
System.out.println("PDF File Created...");
}   
catch (DocumentException e)  
{  
e.printStackTrace();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
}   
catch (FileNotFoundException e)  
{  
e.printStackTrace();  
}  
}  
}  
