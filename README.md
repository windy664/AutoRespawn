<div align="center">

<img src="assets/banner.svg" alt="AutoRespawn" width="100%">

# AutoRespawn

**死亡自动重生** —— 玩家死亡后跳过重生界面直接复活，适合硬核/快节奏服务器。

![Platform](https://img.shields.io/badge/Platform-Spigot%20%2F%20Paper-62bda8?style=flat-square&logo=minecraft&logoColor=white)
![Minecraft](https://img.shields.io/badge/MC-1.20.x-8a9a5b?style=flat-square)
![Java](https://img.shields.io/badge/Java-17-f89820?style=flat-square&logo=openjdk&logoColor=white)

[功能](#-功能) · [配置](#️-配置)

</div>

## ✨ 功能

- **自动重生**：`PlayerDeathListener` 监听死亡事件，立即调用 `spigot().respawn()`，玩家不看到"你死了"界面
- **开关可控**：`enable` 一键启停，`Debug` 输出调试日志
- **启动横幅**：控制台打印插件 logo、版本与运行环境（服务端名称）

## ⚙️ 配置

```yaml
enable: true
Debug: false
```

## 🔨 构建

```bash
./gradlew build
```
