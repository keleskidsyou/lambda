<img src="https://raw.githubusercontent.com/lambda-client/assets/main/lambda%20logo%20text.svg" style="width: 69%">

![GitHub All Releases](https://img.shields.io/github/downloads/lambda-client/lambda/total)
[![CodeFactor](https://www.codefactor.io/repository/github/lambda-client/lambda/badge)](https://www.codefactor.io/repository/github/lambda-client/lambda)
[![build](https://github.com/lambda-client/lambda/workflows/gradle_build/badge.svg)](https://github.com/lambda-client/lambda/actions)
[![Discord Mine](https://img.shields.io/discord/834570721070022687?label=chat&logo=discord&logoColor=white)](https://discord.gg/QjfBxJzE5x)
![minecraft](https://img.shields.io/badge/Minecraft-1.12.2-blue.svg)
<img src="https://img.shields.io/github/languages/code-size/lambda-client/lambda.svg" alt="Code size"/>
<img src="https://img.shields.io/github/repo-size/lambda-client/lambda.svg" alt="GitHub repo size"/>
<img src="https://tokei.rs/b1/github/lambda-client/lambda?category=code" alt="Lines of Code"/>
</p>

Lambda is a free, open-source, Minecraft 1.12.2 utility mod providing a visionary system for plugins that allow customizing the clients features thanks to an ingame plugin store.

<a href="https://github.com/lambda-client/lambda/releases/download/2.07.01/lambda-2.07.01.jar"><img alt="lambda-2.07.01.jar - July 1, 2021 - 12.0 Mb" src="https://raw.githubusercontent.com/lambda-client/assets/main/download_button.png" width="540" height="140"></a>

## Contributing

### Clone Repository

Clone the repository to your local machine. Use the link of either your fork or the main repository.
```
git clone https://github.com/lambda-client/lambda
```

Run `scripts/setupWorkspace.sh` to initialize the environment. 
With terminal on Linux or [Git Bash](https://gitforwindows.org/) for Windows
```
./setupWorkspace.sh
```

### Setup IDE

In this guide we will use [IntelliJ IDEA](https://www.jetbrains.com/idea/) as IDE.
1. Open the project from `File > Open...`
2. Let the IDE collect dependencies and index the code.
3. Goto `File > Project Structure... > SDKs` and make sure an SDK for Java 8 is installed and selected, if not download
   it [here](https://adoptopenjdk.net/index.html?variant=openjdk8&jvmVariant=hotspot)

### Gradle build

Test if the environment is set up correctly by building the client and run it inside IDE using the Gradle tab on the right side of the IDE.
1. Go to `lambda > Tasks > build > runClient` in the Gradle tab and run the client or create a native run using `lambda > Tasks > fg_runs > genIntelliJRuns`.
2. To build the client as a jar run `lambda > Tasks > build > build`. IntelliJ will create a new directory called `build`. The final built jar will be in `build/libs`

## Thanks to

[zeroeightysix](https://github.com/zeroeightysix) for the original [KAMI](https://github.com/zeroeightysix/KAMI)

[KAMI Blue](https://github.com/kami-blue) for the continuation of [KAMI](https://github.com/zeroeightysix/KAMI)

[ronmamo](https://github.com/ronmamo) for [Reflections](https://github.com/ronmamo/reflections)

[MinecraftForge](https://github.com/MinecraftForge) for [Forge](https://github.com/MinecraftForge/MinecraftForge)

All the [contributors](https://github.com/lambda-client/lambda/graphs/contributors)

### Stargazers
[![Stargazers](https://starchart.cc/lambda-client/lambda.svg)](https://starchart.cc/lambda-client/lambda)
