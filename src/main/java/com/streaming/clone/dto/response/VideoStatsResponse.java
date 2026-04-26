package com.streaming.clone.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VideoStatsResponse {

    private long totalViews;
    private long publishedViews;
    private long totalDuration;

}
