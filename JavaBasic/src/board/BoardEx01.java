package board;
// User Reply Board를 모두 활용한

// 로그인 기능 댓글 기능이 있는 게시판 프로그램

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import util.ScannerUtil;

public class BoardEx01 {
    // 댓글을 관리할 ArrayList<> 객체 replyList;
    private static final ArrayList<Reply> replyList = new ArrayList<>();
    // 회원을 관리할 ArrayList<> 객체 userList;
    private static final ArrayList<User> userList = new ArrayList<>();
    // 게시판을 관리할 ArrayList<> 객체 boardList;
    private static final ArrayList<Board> boardList = new ArrayList<>();
    // 입력을 담당할 Scanner 객체 scanner
    private static final Scanner scanner = new Scanner(System.in);
    // 현재 게시글 번호를 저장할 int 변수 boardId
    private static int boardId = 1;
    // 현재 댓글 번호를 저장할 int 변수 replyId
    private static int replyId = 1;
    // 현재 회원 번호를 저장할 int 변수 userId
    private static int userId = 1;
    // 현재 로그인 한 회원 정보를 저장할 User의 객체 logIn
    private static User logIn = null;

    public static void main(String[] args) {

        index();
    }

    // 1. 맨처음 로그인 혹은 회원가입을 안내할
    // index() 메소드

    private static void index() {
        while (true) {
            System.out.println("===================================");
            System.out.println("       비트캠프 게시판 관리 프로그램      ");
            System.out.println("===================================");
            String message = new String("1. 로그인 2. 회원가입 3. 종료");
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
            if (userChoice == 1) {
                // userList.size()가 0이 아닐때만 로그인을 실행하고
                // 그외에는 "아직 등록된 회원이 없습니다."가 출력되게 한다.

                // ArrayList의 경우 isEmpty() 메소드를 사용하면
                // 해당 리스트에 엘리먼트가 존재하는지 체크 가능하다.
                // 만약 리스트가 비어있을 경우 true가 return이 된다.

                if (userList.isEmpty()) {
                    System.out.println();
                    System.out.println("아직 등록된 회원이 없습니다.");
                    System.out.println();
                } else {
                    // userList가 빈값이 아닐시!
                    // 로그인 메소드 실행
                    logIn();

                    // logIn() 메소드 실행 후에
                    // User객체 logIn의 값이 null이 아니면
                    // 게시판 메뉴를 불러오는 showMenu() 메소드를 실행한다.
                    if (logIn != null) {
                        showMenu();
                    }
                }

            } else if (userChoice == 2) {
                // 회원가입 메소드 실행
                register();
            } else if (userChoice == 3) {
                System.out.println();
                System.out.println("이용해 주셔서 감사합니다.");
                break;
            }
        }
    }

    // showMenu()
    private static void showMenu() {
        while (true) {
            System.out.println();
            System.out.println("===================================");
            System.out.println("         게시판 글 관리 프로그램        ");
            System.out.println("===================================");
            System.out.println();
            String message = new String("1. 글 쓰기 2. 글 목록 보기 3. 종료");
            int userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);

            if (userChoice == 1) {
                // 글 작성 담당 메소드 호출
                writeBoard();
            } else if (userChoice == 2) {
                // 글 목록 보기 담당 메소드 호출
                printAllBoard();
            } else if (userChoice == 3) {
                // 메시지 출력 후 종료
                System.out.println("인덱스 화면으로 돌아갑니다.");
                // 사용자가 인덱스화면으로 돌아갈때
                // logIn 객체를 다시 null로 초기화 해준다.
                logIn = null;

                // 지금은 콘솔이라 큰 차이가 없어 보이지만,
                // 웹프로젝트에서는
                // 로그아웃 혹은 로그인 정보가 만료된 이후에
                // 인터넷 주소(=url)을 강제로 입력하여 글수정, 삭제 등의 페이지에
                // 들어가는 것을 막기 위함이다.
                break;
            }
        }
    }

    //
    private static void printAllBoard() {
        // 게시글을 저장하는 boardList가 비어있을경우
        // 아무것도 없다는 경고 메세지만 출력 해준다.
        while (true) {
            if (boardList.isEmpty()) {
                System.out.println();
                System.out.println("아직 등록된 게시글이 존재하지 않습니다.");
                System.out.println();
                break;
            } else {
                // 게시글 작성일을 형식에 맞춰줄 SimpleDataFormat 객체 생성
                SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd");

                System.out.println("===================================");
                System.out.println("            현재 게시판 내용           ");
                System.out.println("===================================");
                for (int i = 0; i < boardList.size(); i++) {

                    Board b = boardList.get(i);
                    // 밑에 selectReplyByBoardId(int boardId) 참조

                    System.out.printf("%d번. %s\t\t%s\n", b.getId(), b.getTitle(),
                            sdf.format(b.getWrittenDate().getTime()));
                }
                System.out.println();
                String message = new String("개별 보기할 글의 번호를 입력해주세요. 뒤로 가시려면 0을 입력하세요.");
                int userChoice = ScannerUtil.nextInt(scanner, message);

                // 사용자가 입력한 글의 번호가 유효한지 체크하기 위해
                // Board객체를 만들어서
                // 그 객체가 boardList에 존재하는지 체크한다.
                Board b = new Board();
                b.setId(userChoice);

                // 만약 userChoice가 0 이 아니고, boardList의 contains(b) 결과가 false 이면
                // 사용자에게 잘못 입력하였으므로 다시 입력해 달라고 하여
                // 올바른 번호가 입력될 때까지 입력을 받는다.

                while (!(userChoice == 0 || boardList.contains(b))) {
                    System.out.println("잘못 입력하셨습니다.");
                    userChoice = ScannerUtil.nextInt(scanner, message);
                    b.setId(userChoice);
                }

                if (userChoice == 0) {
                    break;
                } else {
                    // userChoice를 파라미터로 하는 printOneBoard() 메소드 실행
                    printOneBoard(userChoice);
                }

            }

        }
    }

    private static void printOneBoard(int id) { // 위에 userChoice를 파라미터로 한것
        // 게시글의 상세보기와 해당 게시글의 댓글을 출력해 주는 메소드

        // 파라미터로 받은 id 값을 사용하여
        // 게시글의 정보를 불러온다.
        Board b = retrieveBoard(id);

        // b가 null일 경우 id가 잘못되었다는 의미이므로
        // 경고메세지 출력
        if (b == null) {
            System.out.println();
            System.out.println("존재하지 않는 게시글 번호 입니다.");
            System.out.println();
        } else {

            // 댓글을 저장하는 replyList중에
            // boardId의 값이 파라미터 id와 값이 일치하는
            // Reply 객체를 모두 불러온다.
            // --> ReplyList를 다 불러올 수 없다. boardList의 해당글의 reply 댓글만 불러온다는 뜻
            ArrayList<Reply> list = selectReplyByBoardId(id);

            String writerName = selectNickNameById(b.getWriterId());

            b.print(writerName); // 하나의 선택한 게시글을 프린트하는 Board클래스의 메소드

            System.out.println("===================================");
            System.out.println("              댓      글            ");
            System.out.println("===================================");
            // 만약 댓글이 존재하지 않으면
            // "등록된 댓글이 존재하지 않습니다" 라는 메세지만 출력해주고 그 외에는
            // list의 Reply 객체 print 메소드를 실행시켜주자
            if (list.isEmpty()) {
                System.out.println("   등록된 댓글이 존재하지 않습니다.   ");
            } else {
                for (int i = 0; i < list.size(); i++) {
                    Reply r = list.get(i);
                    r.print(selectNickNameById(r.getWriterId()));
                    // 뭔소리냐면 글쓴사람이 쓴 댓글들이 아니고 글에 대한 댓글이라는 소리
                }
            }

            // 만약 게시글의 작성자와 로그인한 유저가 같을 경우
            // 수정 삭제 뒤로 가기를 출력해주고
            // 그 이외에는 댓글달기와 뒤로가기 만 출력해 준다.
            int userChoice = 0;
            String message;
            if (logIn.getId() == b.getWriterId()) {
                // 작성자와 로그인 유저가 같은 사람이므로
                // 수정 삭제 뒤로가기 중 하나 선택할 수 있도록 한다.
                message = new String("1. 게시글 수정 2. 게시글 삭제 3. 뒤로 가기");
                userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
                if (userChoice == 1) {
                    // 게시글 수정 메소드 실행
                    updateBoard(id);
                } else if (userChoice == 2) {
                    // 게시글 삭제 메소드 실행
                    deleteBoard(id);
                }
            } else {
                // 작성자와 로그인 유저가 같은 사람이 아니므로
                // 댓글달기 댓글삭제 뒤로가기 중 하나를 선택할 수 있게 한다.
                message = new String("1. 댓글 달기 2. 댓글 삭제 3. 뒤로 가기");
                userChoice = ScannerUtil.nextInt(scanner, message, 1, 3);
                if (userChoice == 1) {
                    // 댓글 달기 메소드 실행
                    addReply(id);
                    printOneBoard(id);
                } else if (userChoice == 2) {
                    // 만약 댓글이 존재하지 않으면
                    // 아무런 댓글이 없습니다 메세지 출력하고
                    if (list.isEmpty()) {
                        System.out.println();
                        System.out.println("해당 게시글에는 댓글이 존재하지 않습니다.");
                        System.out.println();
                    } else {
                        // 댓글 삭제 메소드 실행
                        // 그 외에는 다음과 같은 순서를 거친다.

                        // 삭제할 댓글을 선택하게 한다.
                        // 이 때는 댓글번호와 내용만 보여주고
                        // 사옹자가 댓글 번호를 선택하면
                        // 그 번호를 파라미터로 삭제 메소드에 보내준다.
                        for (int i = 0; i < list.size(); i++) {
                            Reply r = list.get(i);
                            System.out.printf("%d. %s \n", r.getId(), r.getContent());
                        }

                        message = new String("삭제할 댓글의 번호를 입력해 주세요. 삭제를 원하시지 않으면 0을 입력하세요.");
                        int userInput = ScannerUtil.nextInt(scanner, message);

                        Reply r = new Reply();
                        r.setId(userInput);

                        while (!(userInput == 0 || list.contains(r))) {
                            System.out.println("유효하지 않은 입력입니다.");
                            userInput = ScannerUtil.nextInt(scanner, message);
                            r.setId(userInput);
                        }

                        // printOne 메소드는 무한루프라가 아니라 처리해 줄 것이 != 0 이거 하나다
                        if (userInput != 0) {
                            // 만약 로그인 유저가 댓글 작성자와 같으면
                            // 댓글 삭제 메소드를 실행한다.

                            // 먼저 댓글 작성자의 id와 로그인한 유저의 id 비교를 위해
                            // 현재 댓글번호 밖에 저장이 안된 Reply객체 r에 나머지 정보를 넣어준다.
                            int replyIndex = list.indexOf(r);
                            r = list.get(replyIndex);

                            if (logIn.getId() == r.getWriterId()) {
                                deleteReply(userInput);
                            } else {
                                System.out.println();
                                System.out.println("해당 댓글의 작성자만 삭제하실 수 있습니다.");
                                System.out.println();
                            }

                        }
                        printOneBoard(id);
                    }

                }
            }

        }

    }

    // 게시글의 id값을 파라미터로 받아서 해당 게시글에 댓글을 추가하는 메소드
    private static void addReply(int boardId) {
        // 정보를 담을 Reply객체 생성
        Reply r = new Reply();

        // id를 replyId값을 주고 replyId++
        r.setId(replyId++);
        // boardId는 파라미터에서 가져온다
        r.setBoardId(boardId);
        // writerId는 User 객체 logIn에서
        r.setWriterId(logIn.getId());

        // 내용을 입력받아서 content에 넣기
        String message = new String("댓글의 내용을 입력하세요.");
        r.setContent(ScannerUtil.nextLine(scanner, message));

        // 입력날짜는 Calendar.getInstance()로
        r.setWrittenDate(Calendar.getInstance());

        // 정보가 다 담긴 Reply객체 r을 리스트에 추가
        replyList.add(r);
    }

    // 게시글의 번호를 파라미터로 받아서
    // 수정하는 updateBoard 메소드
    private static void updateBoard(int boardId) {
        String message;

        // boardId를 통한 인덱스를 찾아온다 인덱스알아야 그 배열에 넣지
        Board b = retrieveBoard(boardId);

        // 새로운 제목을 입력받는다.
        message = new String("새로운 제목을 입력해주세요.");
        b.setTitle(ScannerUtil.nextLine(scanner, message));

        // 새로운 내용을 입력받는다.
        message = new String("새로운 제목을 입력해주세요.");
        b.setContent(ScannerUtil.nextLine(scanner, message));

        // 수정날짜를 그 순간의 시간으로 바꾼다.
        b.setUpdatedDate(Calendar.getInstance());
    }

    // 게시글의 번호를 파라미터로 받아서
    // 삭제하는 deleteBoard 메소드
    private static void deleteBoard(int boardId) {
        // 먼저 정말 게시글을 삭제할지 물어본다.
        String message = new String("게시글을 정말로 삭제하시겠습니까? 삭제하시려면 Y 혹은 y를 입력하세요");
        String yesNo = ScannerUtil.nextLine(scanner, message);
        if (yesNo.equalsIgnoreCase("Y")) {
            // 현재 게시글을 리스트에서 삭제
            // 임시로 객체 b를 만들어서 해당 객체의 id에 boardId값을 set한다
            Board b = new Board();
            b.setId(boardId);

            // list에서 삭제
            boardList.remove(b);

            // 해당 게시글에 달려있던 댓글들을 댓글 리스트에서 삭제
            ArrayList<Reply> temp = selectReplyByBoardId(boardId);
            for (int i = 0; i < temp.size(); i++) {
                Reply r = temp.get(i);
                deleteReply(r.getId());
            }
        } else {
            printOneBoard(boardId);
        }
    }

    // 파라미터로 들어온 댓글 id값과 일치하는
    // 댓글을 리스트에서 삭제하는 deleteReply()
    private static void deleteReply(int replyId) {
        Reply r = new Reply();
        r.setId(replyId);

        replyList.remove(r);
    }

    // 회원번호로 해당 회원의 닉네임을 찾아서 리턴하는 selectNickNameById() 메서드
    private static String selectNickNameById(int writerId) {
        String temp = new String();

        for (int i = 0; i < userList.size(); i++) {
            User u = userList.get(i);
            if (u.getId() == writerId) {
                return u.getNickName();
            }
        }
        return temp;
    }

    // 사용자가 넘겨준 id값으로
    // replayList중에 boardId가 일치하는 Reply객체들을
    // 어레이리스트에 담아서 보여주는 selectReplyByBoardId() 메소드
    // 댓글들은 한두개가 아니고 여러개니까 어레이리스트를 넘겨줘야지
    private static ArrayList<Reply> selectReplyByBoardId(int boardId) {
        ArrayList<Reply> temp = new ArrayList<Reply>();
        for (int i = 0; i < replyList.size(); i++) {
            Reply r = replyList.get(i); // 따로 담아서 편하게 쓰자 맨날 부르지말고
            if (boardId == r.getBoardId()) {
                // if(boardId == replyList.get(i).getBoardId()) 이거와 같지
                temp.add(r); // 아이디가 같으면 r객체의 내용을 다 넘겨주자
            }
        }
        return temp;
    }

    // 사용자가 넘겨준 id 값으로 일치하는 객체를 찾아 리턴해주는
    // retrieveBoard() 메소드
    private static Board retrieveBoard(int id) {
        Board b = new Board();
        b.setId(id);

        if (boardList.contains(b)) {
            int index = boardList.indexOf(b);
            return boardList.get(index);
        }

        return null; // 사용자가 잘못된 id를 넘겨줄 경우 없는거 처리
    }

    // 글쓰기 메소드
    private static void writeBoard() {
        // Board객체를 만들어 정보를 넣고
        // boardList에 추가해 준다.

        // boardList에 추가할 Board의 임시 객체 b
        Board b = new Board();

        // 우리가 미리 준비한 int변수 boardId의 값으로
        // b의 id 를 정해주고 ++
        b.setId(boardId++);

        // 이 게시글의 작성자 id는 당연히 로그인한 회원의 id가 되어야 한다.
        b.setWriterId(logIn.getId());

        // 제목을 입력 뱓는다.
        String message = new String("제목을 입력하세요.");
        b.setTitle(ScannerUtil.nextLine(scanner, message));

        // 내용을 입력 받는다.
        message = new String("내용을 입력하세요.");
        b.setContent(ScannerUtil.nextLine(scanner, message));

        // 작성일과 수정일은 금을 작성하는 현재 시간이 들어가도록 해준다.
        b.setWrittenDate(Calendar.getInstance());
        b.setUpdatedDate(Calendar.getInstance());

        boardList.add(b);
    }

    // 회원가입 메소드
    private static void register() {
        System.out.println();
        System.out.println("회원 가입을 실행합니다.");
        System.out.println();

        User temp = new User();

        temp.setId(userId++);

        String message = new String("사용하실 아이디를 입력해주세요.");
        temp.setUserName(ScannerUtil.nextLine(scanner, message));

        while (validateId(temp) || temp.getUserName().equalsIgnoreCase("X")) {
            System.out.println("해당 아이디는 사용하실 수 없습니다.");
            temp.setUserName(ScannerUtil.nextLine(scanner, message));
        }

        message = new String("사용하실 비밀번호를 입력해주세요.");
        temp.setPassword(ScannerUtil.nextLine(scanner, message));

        message = new String("사용하실 닉네임을 입력해주세요.");
        temp.setNickName(ScannerUtil.nextLine(scanner, message));

        // 다 통과했으니 추가
        userList.add(temp);
    }

    // 회원 리스트 중에서 중복된 아이디가 있는지 체크하는
    // validateId() 메소드
    private static boolean validateId(User u) {// temp객체가 들어올거에요
        for (int i = 0; i < userList.size(); i++) {
            if (u.getUserName().equals(userList.get(i).getUserName())) {
                return true; // 중복이면 true로 반환합니다
            }
        }
        return false;
    }

    // 로그인 메소드
    private static void logIn() {
        // 임시로 id와 비밀번호를 저장할 User 객체 u
        User u = new User();
        // 아이디와 비밀번호를 입력받아서
        // u에 저장 한다.
        String message = new String("아이디를 입력해주세요.");
        u.setUserName(ScannerUtil.nextLine(scanner, message));

        message = new String("비밀번호를 입력해주세요.");
        u.setPassword(ScannerUtil.nextLine(scanner, message));

        // 리스트에서 아이디와 비밀번호가 일치하는 객체를 찾아서
        // 그 객체의 정보를 그대로
        // 현재 로그인 한 회원 정보를 저장할 User의 객체 logIn에다가 넣는다

        /*
         * 이부분이 반복되므로 메소드로 생성할것이다 auth(User 임시객체 u); for ( int i = 0; i <
         * userList.size(); i++) { if (u.logIn(userList.get(i))) { // 이게 true로 넘어와야한다.
         * logIn = userList.get(i); // 그래야 로그인 성공 } }
         */

        logIn = auth(u);

        while (logIn == null) { // 아니면 여기서 빈값일 동안 while이 돕니다
            System.out.println();
            System.out.println("해당하는 정보와 일치하는 회원이 없습니다.");
            System.out.println("다시 아이디와 비밀번호를 입력해주세요");
            System.out.println();

            message = new String("아이디를 입력해주세요. 뒤로 가시려면 X를 입력하세요.");
            u.setUserName(ScannerUtil.nextLine(scanner, message));

            if (u.getUserName().equalsIgnoreCase("x")) {
                break;
            }

            message = new String("비밀번호를 입력해주세요.");
            u.setPassword(ScannerUtil.nextLine(scanner, message));

            logIn = auth(u);
        }

    }

    private static User auth(User u) {
        for (int i = 0; i < userList.size(); i++) {
            if (u.logIn(userList.get(i))) {
                return userList.get(i);
            }
        }
        return null; // if문 안에가 false이면 빈값을 넘긴다.
    }

}
