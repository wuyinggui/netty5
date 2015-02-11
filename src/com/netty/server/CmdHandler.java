package com.netty.server;

import java.util.List;

import com.netty.server.entity.MsgEntity;

public abstract class CmdHandler {
	public abstract void handleMsg(MsgEntity msgEntity, List<MsgEntity> commandList);
}
