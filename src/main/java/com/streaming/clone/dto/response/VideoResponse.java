package com.streaming.clone.dto.response;

import com.streaming.clone.entity.User;
import com.streaming.clone.entity.Video;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.el.parser.BooleanNode;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
public class VideoResponse {

    private Long id;
    private String title;
    private String description;
    private Integer year;
    private String rating;

    private Integer duration;
    private String src;
    private String poster;
    private boolean published;

    private List<String> categories;
    private Instant createAt;
    private Instant updateAt;
    private Boolean isInWatchlist;

    public VideoResponse(
            Long id,
            String title,
            String description,
            Integer year,
            String rationg,
            Integer duration,
            String src,
            String poster,
            boolean published,
            List<String> categories,
            Instant createAt,
            Instant updateAt
    ){
        this.id = id;
        this.title = title;
        this.description = description;
        this.year = year;
        this.rating = rationg;
        this.duration = duration;
        this.src = src;
        this.poster = poster;
        this.published = published;
        this.categories = categories;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public static VideoResponse fromEntity(Video video){
        VideoResponse response =
                new VideoResponse(
                        video.getId(),
                        video.getTitle(),
                        video.getDescriptiom(),
                        video.getYear(),
                        video.getRating(),
                        video.getDuration(),
                        video.getSrc(),
                        video.getPoster(),
                        video.getIsPublished(),
                        video.getCategories(),
                        video.getCreatedAt(),
                        video.getUpdatedAt()
                );
        if(video.getIsInwatchlist() != null){
            response.setIsInWatchlist(video.getIsInwatchlist());
        }
        return response;
    }


}
