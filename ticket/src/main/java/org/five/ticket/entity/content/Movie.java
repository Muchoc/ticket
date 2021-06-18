package org.five.ticket.entity.content;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {
    private String uuid;
    private String type;
    private String name;
    private String mainActors;// 张薛亮/朱昊/杨思远
    private Date releaseTime;//上映时期

}
