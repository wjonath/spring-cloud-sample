package cn.iqoo.oauth2.mapper;

import cn.iqoo.oauth2.entity.OauthClientDetails;
import java.util.List;

public interface OauthClientDetailsMapper {
    int deleteByPrimaryKey(String clientId);

    int insert(OauthClientDetails record);

    OauthClientDetails selectByPrimaryKey(String clientId);

    List<OauthClientDetails> selectAll();

    int updateByPrimaryKey(OauthClientDetails record);
}