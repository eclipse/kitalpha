<center><img src="https://wiki.eclipse.org/images/thumb/a/a2/Kitalpha_logo_small.png/200px-Kitalpha_logo_small.png"></center>

## Eclipse Kitalpha

[![Master build status](https://img.shields.io/jenkins/build?jobUrl=https://ci.eclipse.org/kitalpha/job/Kitalpha/job/master/)](https://ci.eclipse.org/kitalpha/job/Kitalpha/job/master/)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=eclipse_kitalpha&metric=alert_status)](https://sonarcloud.io/dashboard?id=eclipse_kitalpha)
![License](https://img.shields.io/github/license/eclipse/kitalpha)

Kitalpha is an environment to develop and execute MBE (Model-Based Engineering) workbenches for description of systems in system, software and hardware engineering. 

For more details see [the project page](http://www.eclipse.org/kitalpha) and [the main wiki page](http://wiki.eclipse.org/kitalpha).

### Building

The build uses [Tycho](http://www.eclipse.org/tycho/). To launch a complete build, issue
```
mvn clean verify -P core -P product
```
from the top-level directory.

The resulting product can be found in `releng/plugins/org.polarsys.kitalpha.releng.sdk.product/target/products/`.