package report_0413;

import report_0413.Lendable.State;

class SeparateVolume implements Lendable  {
    String requestNo;      // û����ȣ
    String bookTitle;      // ����
    String writer;         // ����
    String borrower;       // ������
    String checkOutDate;   // ������
    State state;            // ������� - �ʱ�ȭ(0)
    SeparateVolume(String requestNo, String bookTitle, String writer) {
        this.requestNo = requestNo;//û����ȣ
        this.bookTitle = bookTitle;//����
        this.writer = writer;      //����
        this.state = State.STATE_NORMAL;
    }
    public void checkOut(String borrower, String date) {
        if (state != State.STATE_NORMAL) //STATE_NORMAL=0(������� ���� ����)-Lendable �������̽� ��� �ʵ�
            return;
        this.borrower = borrower;
        this.checkOutDate = date;
        this.state = State.STATE_BORROWED; //STATE_BORROWED=1(������)-Lendable �������̽� ��� �ʵ�
        System.out.println("*" + bookTitle + " ��(��) ����Ǿ����ϴ�.");
        System.out.println("������:" + borrower);
        System.out.println("������:" + date + "\n");    
    }
    public void checkIn() {
        this.borrower = null;
        this.checkOutDate = null;
        this.state = State.STATE_NORMAL;
        System.out.println("*" + bookTitle + " ��(��) �ݳ��Ǿ����ϴ�.\n");
    }
}