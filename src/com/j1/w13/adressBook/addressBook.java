
package com.j1.w13.adressBook;


import java.util.Scanner;

public class addressBook implements personDao{
  public Scanner sc = new Scanner(System.in);
  public persons[] persons;
  public addressBook(persons[] persons){
    this.persons = persons;
  }
  public int i = 0;
  String status = "0";
  public String name;
  public String num;
  public String startProcess(){
    System.out.println("������ �۾��� �������ּ���.");
    System.out.println("1: ���");
    System.out.println("2: ����");
    System.out.println("3: �μ�");
    System.out.println("4: ����");
    status= sc.nextLine();
    return status;
  }

  public void add(){
    System.out.println("�̸��� �Է��ϼ���:");
    name = sc.nextLine();
    System.out.println("�޴���ȭ ��ȣ�� �Է��ϼ���:");
    num = sc.nextLine();
    persons[i] = new persons(name, num);
    i++;
    System.out.println("���������� ��ϵǾ����ϴ�.");
  }
  
  public void delete(){
      System.out.println("�̸��� �Է��ϼ���:");
      String deleteName = sc.nextLine();
      for (int j = 0; j<i; j++){
        if (deleteName.equals(persons[j].name)){
          persons[j].name = "";
          persons[j].num = "";
          System.out.println("���������� �����Ǿ����ϴ�.");
        }else{
          System.out.println("�ش� �̸��� ����� �����ϴ�.");
        }
      }
  
  public void print(){
    System.out.println("===============��½���============");
    for (int i=0; i<persons.length; i++){
      System.out.println("�̸� :"+persons[i].name);
      System.out.println("��ȣ :"+persons[i].num);
    }
    System.out.println("===============================");
  }
}
