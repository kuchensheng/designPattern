package com.design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chensheng.Ku
 * @version 创建时间：2019/2/19 11:22
 */
public class OrderManage {
    private List<AbstractRole> roles = new ArrayList<>();
    private List<String> submodules = new ArrayList<>();

    public void attach(AbstractRole role) {
        roles.add(role);
    }

    public void removeSubmodules(String submodule) {
        submodules.remove(submodule);
        notifyRelvevantRoles("removeSubmodules : " + submodule);
    }

    public void addSubmodule(String submodule) {
        submodules.add(submodule);
        notifyRelvevantRoles("addSubmodules : " + submodule);
    }

    private void notifyRelvevantRoles(String msg) {
        for (AbstractRole role:roles) {
            role.update(msg);
        }
    }
}
