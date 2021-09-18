package com.zz.crowd.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zwz.crowd.util.ResultEntity;
import com.zz.crowd.entity.po.MemberPO;

/**
 * mysql-provider对应的微服务名称
 * @author zz
 *
 */
@FeignClient("zz-crowd-mysql")
public interface MySQLRemoteService {

    @RequestMapping("/get/memberpo/by/login/acct/remote")
    public ResultEntity<MemberPO> getMemberPOByLoginAcctRemote(@RequestParam("loginacct") String loginacct);

    @RequestMapping("/save/member/remote")
    public ResultEntity<String> saveMember(@RequestBody MemberPO memberPO);
}
