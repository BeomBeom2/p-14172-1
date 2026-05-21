package com.back.global.reData;

import com.back.domain.post.postComment.dto.PostCommentDto;

public record RsData(String resultCode, String msg, PostCommentDto data) {
}