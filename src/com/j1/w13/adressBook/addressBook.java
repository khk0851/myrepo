
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
    System.out.println("수행할 작업을 선택해주세요.");
    System.out.println("1: 등록");
    System.out.println("2: 삭제");
    System.out.println("3: 인쇄");
    System.out.println("4: 종료");
    status= sc.nextLine();
    return status;
  }

  public void add(){
    System.out.println("이름을 입력하세요:");
    name = sc.nextLine();
    System.out.println("휴대전화 번호를 입력하세요:");
    num = sc.nextLine();
    persons[i] = new persons(name, num);
    i++;
    System.out.println("성공적으로 등록되었습니다.");
  }
  
  public void delete(){
      System.out.println("이름을 입력하세요:");
      String deleteName = sc.nextLine();
      for (int j = 0; j<i; j++){
        if (deleteName.equals(persons[j].name)){
          persons[j].name = "";
          persons[j].num = "";
          System.out.println("성공적으로 삭제되었습니다.");
        }else{
          System.out.println("해당 이름의 사람이 없습니다.");
        }
      }
  
  public void print(){
    System.out.println("===============출력시작============");
    for (int i=0; i<persons.length; i++){
      System.out.println("이름 :"+persons[i].name);
      System.out.println("번호 :"+persons[i].num);
    }
    System.out.println("===============================");
  }
}
