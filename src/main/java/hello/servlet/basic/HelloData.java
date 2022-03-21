package hello.servlet.basic;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * <pre>
 * 수정일              수정자           수정내용
 * ------------------ -------------- -------------------------
 * 2022-03-18 018        RYU            최초 작성
 * <pre>
 *
 * @author naramp4@gmail.com
 * @date 2022-03-18 018
 * @version 1.0.0
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
public class HelloData {
	private String username;
	private int age;
}
