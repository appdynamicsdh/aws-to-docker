/*
 * Copyright (c) AppDynamics, Inc., and its affiliates
 * 2016
 * All Rights Reserved
 * THIS IS UNPUBLISHED PROPRIETARY CODE OF APPDYNAMICS, INC.
 * The copyright notice above does not evidence any actual or intended publication of such source code
 */

package sample.freemarker;

import com.google.common.collect.ImmutableMap;

import java.util.Set;


public class DockerHttpApiData {
    public static final String DEFAULT_STRING_VALUE = "";
    public static final String DEFAULT_CONTAINER_ID =
            "5e9abfe35a28733915cd50975bc705595ca67fba07544d6a35e2349766f4d73a";
    public final static String DEFAULT_PROCESSES_FOR_CONTAINER_URL =
            "/containers/" + DockerHttpApiData.DEFAULT_CONTAINER_ID + "/top?ps_args=aux";

    public final static String IMAGE1_FOR_IMAGE_URL = "/images/" + DockerHttpApiData.DEFAULT_CONTAINER_ID  + "/json";
    public final static String CONTAINER_URL = "/containers/" + DockerHttpApiData.DEFAULT_CONTAINER_ID  + "/json";

    // Data captured for test verification.
    private final static ImmutableMap<String, String> data = ImmutableMap.of(
                    // for getServerInfo method
                    "/info",
                    "HTTP/1.0 200 OK\n"
                            + "Content-Type: application/json\n"
                            + "Server: Docker/1.12.0 (linux)\n"
                            + "Date: Fri, 09 Sep 2016 22:37:56 GMT\n"
                            + "Content-Length: 1874\n"
                            + "\n"
                            + "{\"ID\":\"FBHO:WLCN:KUU6:JLR3:T3BV:46IM:WCRN:XVRI:3KIS:TPLO:WY6Z:JIVW\",\"Containers\":43,"
                            + "\"ContainersRunning\":6,\"ContainersPaused\":0,\"ContainersStopped\":37,\"Images\":37,"
                            + "\"Driver\":\"aufs\",\"DriverStatus\":[[\"Root Dir\",\"/var/lib/docker/aufs\"],[\"Backing "
                            + "Filesystem\",\"extfs\"],[\"Dirs\",\"141\"],[\"Dirperm1 Supported\",\"true\"]],"
                            + "\"SystemStatus\":null,\"Plugins\":{\"Volume\":[\"local\"],\"Network\":[\"host\",\"null\","
                            + "\"bridge\",\"overlay\"],\"Authorization\":null},\"MemoryLimit\":true,\"SwapLimit\":false,"
                            + "\"KernelMemory\":true,\"CpuCfsPeriod\":true,\"CpuCfsQuota\":true,\"CPUShares\":true,"
                            + "\"CPUSet\":true,\"IPv4Forwarding\":true,\"BridgeNfIptables\":true,\"BridgeNfIp6tables\":true,"

                            + "\"Debug\":false,\"NFd\":48,\"OomKillDisable\":true,\"NGoroutines\":68,"
                            + "\"SystemTime\":\"2016-09-09T15:37:56.056795748-07:00\",\"ExecutionDriver\":\"\","
                            + "\"LoggingDriver\":\"json-file\",\"CgroupDriver\":\"cgroupfs\",\"NEventsListener\":0,"
                            + "\"KernelVersion\":\"3.16.0-30-generic\",\"OperatingSystem\":\"Ubuntu 14.04.4 LTS\","
                            + "\"OSType\":\"linux\",\"Architecture\":\"x86_64\",\"IndexServerAddress\":\"https://index"
                            + ".docker"
                            + ".io/v1/\",\"RegistryConfig\":{\"InsecureRegistryCIDRs\":[\"127.0.0.0/8\"],"
                            + "\"IndexConfigs\":{\"docker.io\":{\"Name\":\"docker.io\",\"Mirrors\":null,\"Secure\":true,"
                            + "\"Official\":true}},\"Mirrors\":null},\"NCPU\":12,\"MemTotal\":33707565056,"
                            + "\"DockerRootDir\":\"/var/lib/docker\",\"HttpProxy\":\"\",\"HttpsProxy\":\"\",\"NoProxy\":\"\","
                            + "\"Name\":\"AppDy-iNet-Demo-Server\",\"Labels\":null,\"ExperimentalBuild\":false,"
                            + "\"ServerVersion\":\"1.12.0\",\"ClusterStore\":\"\",\"ClusterAdvertise\":\"\","
                            + "\"SecurityOptions\":[\"apparmor\"],\"Runtimes\":{\"runc\":{\"path\":\"docker-runc\"}},"
                            + "\"DefaultRuntime\":\"runc\",\"Swarm\":{\"NodeID\":\"\",\"NodeAddr\":\"\","
                            + "\"LocalNodeState\":\"inactive\",\"ControlAvailable\":false,\"Error\":\"\",\"RemoteManagers\":null,"

                            + "\"Nodes\":0,\"Managers\":0,\"Cluster\":{\"ID\":\"\",\"Version\":{},"
                            + "\"CreatedAt\":\"0001-01-01T00:00:00Z\",\"UpdatedAt\":\"0001-01-01T00:00:00Z\","
                            + "\"Spec\":{\"Orchestration\":{},\"Raft\":{},\"Dispatcher\":{},\"CAConfig\":{},"
                            + "\"TaskDefaults\":{}}}},\"LiveRestoreEnabled\":false}\n",

                    CONTAINER_URL,
                "HTTP/1.0 200 OK\n"
                    + "Content-Type: application/json\n"
                    + "Server: Docker/1.12.0 (linux)\n"
                    + "Date: Fri, 09 Sep 2016 22:39:37 GMT\n"
                    + "\n"
                        + "{\"Id\":\"a4b11360569fef1a3552a7644bcae852cfdd424a829662752fca83b90e71b23f\",\"Created\":\"2019-02-28T14:37:06.977787342Z\",\"Path\":\"/bin/bash\",\"Args\":[\"-c\",\"sh -x /root/paworkspace/containerstartup.sh; tail -f /dev/null\"],\"State\":{\"Status\":\"running\",\"Running\":true,\"Paused\":false,\"Restarting\":false,\"OOMKilled\":false,\"Dead\":false,\"Pid\":2399,\"ExitCode\":0,\"Error\":\"\",\"StartedAt\":\"2019-02-28T14:37:07.665348983Z\",\"FinishedAt\":\"0001-01-01T00:00:00Z\"},\"Image\":\"sha256:1fd8f6d8d812df7a37db242f2be2f04fe6bbb2e57d31856d0ad5a7ffc5702e56\",\"ResolvConfPath\":\"/var/lib/docker/containers/93418a294d3df2f236daa04f8b7357483fd375bc419c00d173fb5cf5b498d408/resolv.conf\",\"HostnamePath\":\"/var/lib/docker/containers/93418a294d3df2f236daa04f8b7357483fd375bc419c00d173fb5cf5b498d408/hostname\",\"HostsPath\":\"/var/lib/docker/containers/93418a294d3df2f236daa04f8b7357483fd375bc419c00d173fb5cf5b498d408/hosts\",\"LogPath\":\"/var/lib/docker/containers/93418a294d3df2f236daa04f8b7357483fd375bc419c00d173fb5cf5b498d408/93418a294d3df2f236daa04f8b7357483fd375bc419c00d173fb5cf5b498d408-json.log\",\"Name\":\"/romantic_gates\",\"RestartCount\":0,\"Driver\":\"overlay2\",\"Platform\":\"linux\",\"MountLabel\":\"\",\"ProcessLabel\":\"\",\"AppArmorProfile\":\"docker-default\",\"ExecIDs\":[\"aec2b6384c9ca3fca2c7b7d747cb4b9ae4e7c414f7f49a419cd09ec6924a55c3\"],\"HostConfig\":{\"Binds\":null,\"ContainerIDFile\":\"\",\"LogConfig\":{\"Type\":\"json-file\",\"Config\":{}},\"NetworkMode\":\"default\",\"PortBindings\":{},\"RestartPolicy\":{\"Name\":\"no\",\"MaximumRetryCount\":0},\"AutoRemove\":false,\"VolumeDriver\":\"\",\"VolumesFrom\":null,\"CapAdd\":null,\"CapDrop\":null,\"Dns\":[],\"DnsOptions\":[],\"DnsSearch\":[],\"ExtraHosts\":null,\"GroupAdd\":null,\"IpcMode\":\"shareable\",\"Cgroup\":\"\",\"Links\":null,\"OomScoreAdj\":0,\"PidMode\":\"\",\"Privileged\":false,\"PublishAllPorts\":true,\"ReadonlyRootfs\":false,\"SecurityOpt\":null,\"UTSMode\":\"\",\"UsernsMode\":\"\",\"ShmSize\":67108864,\"Runtime\":\"runc\",\"ConsoleSize\":[0,0],\"Isolation\":\"\",\"CpuShares\":0,\"Memory\":0,\"NanoCpus\":0,\"CgroupParent\":\"\",\"BlkioWeight\":0,\"BlkioWeightDevice\":[],\"BlkioDeviceReadBps\":null,\"BlkioDeviceWriteBps\":null,\"BlkioDeviceReadIOps\":null,\"BlkioDeviceWriteIOps\":null,\"CpuPeriod\":0,\"CpuQuota\":0,\"CpuRealtimePeriod\":0,\"CpuRealtimeRuntime\":0,\"CpusetCpus\":\"\",\"CpusetMems\":\"\",\"Devices\":[],\"DeviceCgroupRules\":null,\"DiskQuota\":0,\"KernelMemory\":0,\"MemoryReservation\":0,\"MemorySwap\":0,\"MemorySwappiness\":null,\"OomKillDisable\":false,\"PidsLimit\":0,\"Ulimits\":null,\"CpuCount\":0,\"CpuPercent\":0,\"IOMaximumIOps\":0,\"IOMaximumBandwidth\":0,\"MaskedPaths\":[\"/proc/asound\",\"/proc/acpi\",\"/proc/kcore\",\"/proc/keys\",\"/proc/latency_stats\",\"/proc/timer_list\",\"/proc/timer_stats\",\"/proc/sched_debug\",\"/proc/scsi\",\"/sys/firmware\"],\"ReadonlyPaths\":[\"/proc/bus\",\"/proc/fs\",\"/proc/irq\",\"/proc/sys\",\"/proc/sysrq-trigger\"]},\"GraphDriver\":{\"Data\":{\"LowerDir\":\"/var/lib/docker/overlay2/2375645480ae4e98342f2957e6839bfb30b0705b95d5bbd7ce3f201517c0237c-init/diff:/var/lib/docker/overlay2/6bdf582c7a299f7f8fd333d47cf086c7c9b7dc6d60d87dae17fc5dad2a8d8565/diff:/var/lib/docker/overlay2/367334e01efa00b3c4bc7abfd2aad137e0539c24f13cbadeb6c6177232020d7a/diff:/var/lib/docker/overlay2/934b7bcfb2bcf2ce1696c29840650f1e6bed299920fbeb0fe1f4dab9daf93070/diff:/var/lib/docker/overlay2/0c4302772a7febb614e577f30a6e97fd9d3259c1177941163a82d3eb0eda9f52/diff:/var/lib/docker/overlay2/2bdd978d6845b256c2e65a00ea2401ca5d5394a77c76157db0254750a406e8b1/diff:/var/lib/docker/overlay2/e7b368466bdb236ad3e79648870fb25ab051dc58f539c1c39c7876b6b3da3c65/diff:/var/lib/docker/overlay2/e1aa21fc50e360afe044ade5373e73fe35faf010392b572cb001819866bb8fd9/diff:/var/lib/docker/overlay2/2ffa3e4be091c676a937a2f26e93ca879d61e3720788007c67bf6b33a97811b2/diff:/var/lib/docker/overlay2/be421174f4657044424d55755f9841655247c7d4d45e505d7d41896602cf5452/diff:/var/lib/docker/overlay2/7d65b3f693de43e7c153b5016ff3bdb255e96871a5976eef8d597a3ac4a49e88/diff\",\"MergedDir\":\"/var/lib/docker/overlay2/2375645480ae4e98342f2957e6839bfb30b0705b95d5bbd7ce3f201517c0237c/merged\",\"UpperDir\":\"/var/lib/docker/overlay2/2375645480ae4e98342f2957e6839bfb30b0705b95d5bbd7ce3f201517c0237c/diff\",\"WorkDir\":\"/var/lib/docker/overlay2/2375645480ae4e98342f2957e6839bfb30b0705b95d5bbd7ce3f201517c0237c/work\"},\"Name\":\"overlay2\"},\"Mounts\":[],\"Config\":{\"Hostname\":\"93418a294d3d\",\"Domainname\":\"\",\"User\":\"\",\"AttachStdin\":false,\"AttachStdout\":false,\"AttachStderr\":false,\"ExposedPorts\":{\"22/tcp\":{},\"3306/tcp\":{},\"4848/tcp\":{},\"8080/tcp\":{},\"8181/tcp\":{},\"9009/tcp\":{},\"9080/tcp\":{},\"9081/tcp\":{},\"9191/tcp\":{},\"9200/tcp\":{}},\"Tty\":true,\"OpenStdin\":true,\"StdinOnce\":false,\"Env\":[\"PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin\",\"CONTROLLER_PROFILE=small\"],\"Cmd\":[\"/bin/bash\",\"-c\",\"sh -x /root/paworkspace/containerstartup.sh; tail -f /dev/null\"],\"ArgsEscaped\":true,\"Image\":\"1fd8f6d8d812df7a37db242f2be2f04fe6bbb2e57d31856d0ad5a7ffc5702e56\",\"Volumes\":null,\"WorkingDir\":\"/root/paworkspace\",\"Entrypoint\":null,\"OnBuild\":null,\"Labels\":{\"MAINTAINER\":\"Shobhit Singhal <shobhit.singhal@appdynamics.com>\",\"NAME\":\"appdynamics/enterprise-console\",\"VERSION\":\"4.5.4.16536\",\"org.label-schema.description\":\"Docker Image for Enterprise Console\",\"org.label-schema.name\":\"appdynamics/enterprise-console\",\"org.label-schema.schema-version\":\"1.0\",\"org.label-schema.vcs-ref\":\"4264197\",\"org.label-schema.vcs-url\":\"https://bitbucket.corp.appdynamics.com/pa/platform-admin-docker-image\",\"org.label-schema.version\":\"4.5.4.16536\"}},\"NetworkSettings\":{\"Bridge\":\"\",\"SandboxID\":\"3e9a092f78cc9c19f830e56dd1f5f9c1b1931c6f2dc38a4ccac8e8fe35efb095\",\"HairpinMode\":false,\"LinkLocalIPv6Address\":\"\",\"LinkLocalIPv6PrefixLen\":0,\"Ports\":{\"22/tcp\":[{\"HostIp\":\"0.0.0.0\",\"HostPort\":\"32777\"}],\"3306/tcp\":[{\"HostIp\":\"0.0.0.0\",\"HostPort\":\"32776\"}],\"4848/tcp\":[{\"HostIp\":\"0.0.0.0\",\"HostPort\":\"32775\"}],\"8080/tcp\":[{\"HostIp\":\"0.0.0.0\",\"HostPort\":\"32774\"}],\"8181/tcp\":[{\"HostIp\":\"0.0.0.0\",\"HostPort\":\"32773\"}],\"9009/tcp\":[{\"HostIp\":\"0.0.0.0\",\"HostPort\":\"32772\"}],\"9080/tcp\":[{\"HostIp\":\"0.0.0.0\",\"HostPort\":\"32771\"}],\"9081/tcp\":[{\"HostIp\":\"0.0.0.0\",\"HostPort\":\"32770\"}],\"9191/tcp\":[{\"HostIp\":\"0.0.0.0\",\"HostPort\":\"32769\"}],\"9200/tcp\":[{\"HostIp\":\"0.0.0.0\",\"HostPort\":\"32768\"}]},\"SandboxKey\":\"/var/run/docker/netns/3e9a092f78cc\",\"SecondaryIPAddresses\":null,\"SecondaryIPv6Addresses\":null,\"EndpointID\":\"1ea9bef7b6cdaa22f1bb2234fd12690673bb6dee8e89834b03adac55ead94f77\",\"Gateway\":\"172.17.0.1\",\"GlobalIPv6Address\":\"\",\"GlobalIPv6PrefixLen\":0,\"IPAddress\":\"172.17.0.2\",\"IPPrefixLen\":16,\"IPv6Gateway\":\"\",\"MacAddress\":\"02:42:ac:11:00:02\",\"Networks\":{\"bridge\":{\"IPAMConfig\":null,\"Links\":null,\"Aliases\":null,\"NetworkID\":\"b86aacae9749465378e3bc1e87aef5906cf363957f5b091dac36fc2afc1603fa\",\"EndpointID\":\"1ea9bef7b6cdaa22f1bb2234fd12690673bb6dee8e89834b03adac55ead94f77\",\"Gateway\":\"172.17.0.1\",\"IPAddress\":\"172.17.0.2\",\"IPPrefixLen\":16,\"IPv6Gateway\":\"\",\"GlobalIPv6Address\":\"\",\"GlobalIPv6PrefixLen\":0,\"MacAddress\":\"02:42:ac:11:00:02\",\"DriverOpts\":null}}}}",
                       // for the getContainers method
                    "/containers/json",
                    "HTTP/1.0 200 OK\n"
                            + "Content-Type: application/json\n"
                            + "Server: Docker/1.12.0 (linux)\n"
                            + "Date: Fri, 09 Sep 2016 22:39:37 GMT\n"
                            + "\n"
                            + "[{\"Id\":\"a4b11360569fef1a3552a7644bcae852cfdd424a829662752fca83b90e71b23f\","
                            + "\"Names\":[\"/clever_swirles\"],\"Image\":\"ipoernomo/ma:v1\","
                            + "\"ImageID\":\"sha256:5bb45bf1782a6880aad8f54a08b860a348bb9ac6612e6f661c3a68380f1af97c\","
                            + "\"Command\":\"/bin/bash\",\"Created\":1470431266,\"Ports\":[],\"Labels\":{},"
                            + "\"State\":\"running\",\"Status\":\"Up 5 weeks\",\"HostConfig\":{\"NetworkMode\":\"default\"},"
                            + "\"NetworkSettings\":{\"Networks\":{\"bridge\":{\"IPAMConfig\":null,\"Links\":null,"
                            + "\"Aliases\":null,"
                            + "\"NetworkID\":\"d1ed82fbb8a227d0e66c5b264875f3d75bd5404a9610b15b2515abfef1031dba\","
                            + "\"EndpointID\":\"6cf168683afef0e70e9bba70d67f8e97de573c16b3946f6c140e45ea1227a43b\","
                            + "\"Gateway\":\"172.17.0.1\",\"IPAddress\":\"172.17.0.7\",\"IPPrefixLen\":16,"
                            + "\"IPv6Gateway\":\"\",\"GlobalIPv6Address\":\"\",\"GlobalIPv6PrefixLen\":0,"
                            + "\"MacAddress\":\"02:42:ac:11:00:07\"}}},\"Mounts\":[{\"Source\":\"/var/run/docker.sock\","
                            + "\"Destination\":\"/var/run/docker.sock\",\"Mode\":\"\",\"RW\":true,"
                            + "\"Propagation\":\"rprivate\"}]},"
                            + "{\"Id\":\"319a7adcd9d5794871dd3003b2efc751179cac5f35052d241d45e8e3ef1c6a2c\","
                            + "\"Names\":[\"/big_shirley\"],\"Image\":\"ipoernomo/ma:v1\","
                            + "\"ImageID\":\"sha256:5bb45bf1782a6880aad8f54a08b860a348bb9ac6612e6f661c3a68380f1af97c\","
                            + "\"Command\":\"bin/bash\",\"Created\":1470430711,\"Ports\":[],\"Labels\":{},"
                            + "\"State\":\"running\",\"Status\":\"Up 5 weeks\",\"HostConfig\":{\"NetworkMode\":\"default\"},"
                            + "\"NetworkSettings\":{\"Networks\":{\"bridge\":{\"IPAMConfig\":null,\"Links\":null,"
                            + "\"Aliases\":null,"
                            + "\"NetworkID\":\"d1ed82fbb8a227d0e66c5b264875f3d75bd5404a9610b15b2515abfef1031dba\","
                            + "\"EndpointID\":\"b28cee759d3612534dfe362aad342e9c30fb272fbe09052e4c023fe208686916\","
                            + "\"Gateway\":\"172.17.0.1\",\"IPAddress\":\"172.17.0.6\",\"IPPrefixLen\":16,"
                            + "\"IPv6Gateway\":\"\",\"GlobalIPv6Address\":\"\",\"GlobalIPv6PrefixLen\":0,"
                            + "\"MacAddress\":\"02:42:ac:11:00:06\"}}},\"Mounts\":[{\"Source\":\"/var/run/docker.sock\","
                            + "\"Destination\":\"/var/run/docker.sock\",\"Mode\":\"\",\"RW\":true,"
                            + "\"Propagation\":\"rprivate\"}]},"
                            + "{\"Id\":\"b136d656c094c5675c9c45b9c0a3b34bc525c7831555337beaccfe282f1bbe2f\","
                            + "\"Names\":[\"/loving_poincare\"],\"Image\":\"ipoernomo/ma:v1\","
                            + "\"ImageID\":\"sha256:5bb45bf1782a6880aad8f54a08b860a348bb9ac6612e6f661c3a68380f1af97c\","
                            + "\"Command\":\"bin/bash\",\"Created\":1470360048,\"Ports\":[],\"Labels\":{},"
                            + "\"State\":\"running\",\"Status\":\"Up 5 weeks\",\"HostConfig\":{\"NetworkMode\":\"default\"},"
                            + "\"NetworkSettings\":{\"Networks\":{\"bridge\":{\"IPAMConfig\":null,\"Links\":null,"
                            + "\"Aliases\":null,"
                            + "\"NetworkID\":\"d1ed82fbb8a227d0e66c5b264875f3d75bd5404a9610b15b2515abfef1031dba\","
                            + "\"EndpointID\":\"e60ad5adde87db82122b0636641a1262400d8635851c34040c9538c10100dec9\","
                            + "\"Gateway\":\"172.17.0.1\",\"IPAddress\":\"172.17.0.5\",\"IPPrefixLen\":16,"
                            + "\"IPv6Gateway\":\"\",\"GlobalIPv6Address\":\"\",\"GlobalIPv6PrefixLen\":0,"
                            + "\"MacAddress\":\"02:42:ac:11:00:05\"}}},\"Mounts\":[{\"Source\":\"/var/run/docker.sock\","
                            + "\"Destination\":\"/var/run/docker.sock\",\"Mode\":\"\",\"RW\":true,"
                            + "\"Propagation\":\"rprivate\"}]},"
                            + "{\"Id\":\"8e40fab0fa0e9a52cb923ef912492a60242cfbbbb91324665b97c84483cbbb09\","
                            + "\"Names\":[\"/cranky_jones\"],"
                            + "\"Image\":\"sha256:d1783e8e641db97f93dfcc2c0cacaffcaeef399740e849383ff5ed5e0a7f759f\","
                            + "\"ImageID\":\"sha256:d1783e8e641db97f93dfcc2c0cacaffcaeef399740e849383ff5ed5e0a7f759f\","
                            + "\"Command\":\"bin/bash\",\"Created\":1470345946,\"Ports\":[],\"Labels\":{},"
                            + "\"State\":\"running\",\"Status\":\"Up 5 weeks\",\"HostConfig\":{\"NetworkMode\":\"default\"},"
                            + "\"NetworkSettings\":{\"Networks\":{\"bridge\":{\"IPAMConfig\":null,\"Links\":null,"
                            + "\"Aliases\":null,"
                            + "\"NetworkID\":\"d1ed82fbb8a227d0e66c5b264875f3d75bd5404a9610b15b2515abfef1031dba\","
                            + "\"EndpointID\":\"9d18be0e2e91aff4c16f95d5e92d95f4793c9d6f5b02cb4a2dc8146c5af51574\","
                            + "\"Gateway\":\"172.17.0.1\",\"IPAddress\":\"172.17.0.4\",\"IPPrefixLen\":16,"
                            + "\"IPv6Gateway\":\"\",\"GlobalIPv6Address\":\"\",\"GlobalIPv6PrefixLen\":0,"
                            + "\"MacAddress\":\"02:42:ac:11:00:04\"}}},\"Mounts\":[{\"Source\":\"/var/run/docker.sock\","
                            + "\"Destination\":\"/var/run/docker.sock\",\"Mode\":\"\",\"RW\":true,"
                            + "\"Propagation\":\"rprivate\"}]},"
                            + "{\"Id\":\"8de6da4ea8ee0b60364dcc7e44467a1eb523b79408f9d11f80bcec19df598258\","
                            + "\"Names\":[\"/stoic_liskov\"],"
                            + "\"Image\":\"sha256:083a70d3f7a7916fe9f66dbeb781b6b231a74ccd345ebab765341294216e4f1f\","
                            + "\"ImageID\":\"sha256:083a70d3f7a7916fe9f66dbeb781b6b231a74ccd345ebab765341294216e4f1f\","
                            + "\"Command\":\"bin/bash\",\"Created\":1470334597,\"Ports\":[],\"Labels\":{},"
                            + "\"State\":\"running\",\"Status\":\"Up 5 weeks\",\"HostConfig\":{\"NetworkMode\":\"default\"},"
                            + "\"NetworkSettings\":{\"Networks\":{\"bridge\":{\"IPAMConfig\":null,\"Links\":null,"
                            + "\"Aliases\":null,"
                            + "\"NetworkID\":\"d1ed82fbb8a227d0e66c5b264875f3d75bd5404a9610b15b2515abfef1031dba\","
                            + "\"EndpointID\":\"40d1b30db794bf53abc963aaa93ba6911fcb7f04f89e31e309ab3f7bdd5384aa\","
                            + "\"Gateway\":\"172.17.0.1\",\"IPAddress\":\"172.17.0.3\",\"IPPrefixLen\":16,"
                            + "\"IPv6Gateway\":\"\",\"GlobalIPv6Address\":\"\",\"GlobalIPv6PrefixLen\":0,"
                            + "\"MacAddress\":\"02:42:ac:11:00:03\"}}},\"Mounts\":[{\"Source\":\"/var/run/docker.sock\","
                            + "\"Destination\":\"/var/run/docker.sock\",\"Mode\":\"\",\"RW\":true,"
                            + "\"Propagation\":\"rprivate\"}]},"
                            + "{\"Id\":\"48d6916be74cf2320d614df83fdad56ee508a28c4a8946734a7ce717d1146c28\","
                            + "\"Names\":[\"/trusting_shockley\"],"
                            + "\"Image\":\"sha256:319ae6701c87c150182eb8f89d3220348286fb1b2f1d3024fcfdef4b3f8a1b2f\","
                            + "\"ImageID\":\"sha256:319ae6701c87c150182eb8f89d3220348286fb1b2f1d3024fcfdef4b3f8a1b2f\","
                            + "\"Command\":\"bin/bash\",\"Created\":1470272859,\"Ports\":[],\"Labels\":{},"
                            + "\"State\":\"running\",\"Status\":\"Up 5 weeks\",\"HostConfig\":{\"NetworkMode\":\"default\"},"
                            + "\"NetworkSettings\":{\"Networks\":{\"bridge\":{\"IPAMConfig\":null,\"Links\":null,"
                            + "\"Aliases\":null,"
                            + "\"NetworkID\":\"d1ed82fbb8a227d0e66c5b264875f3d75bd5404a9610b15b2515abfef1031dba\","
                            + "\"EndpointID\":\"ef0c11c0cc2433d61cf1de20f06a7487c3114d509d123e17f55dc4c0dd6e0942\","
                            + "\"Gateway\":\"172.17.0.1\",\"IPAddress\":\"172.17.0.2\",\"IPPrefixLen\":16,"
                            + "\"IPv6Gateway\":\"\",\"GlobalIPv6Address\":\"\",\"GlobalIPv6PrefixLen\":0,"
                            + "\"MacAddress\":\"02:42:ac:11:00:02\"}}},\"Mounts\":[{\"Source\":\"/var/run/docker.sock\","
                            + "\"Destination\":\"/var/run/docker.sock\",\"Mode\":\"\",\"RW\":true,"
                            + "\"Propagation\":\"rprivate\"}]}]\n",

            // for the getProcessesForContainer method.
            DEFAULT_PROCESSES_FOR_CONTAINER_URL,
            "HTTP/1.1 200 OK\n"
                    + "Content-Type: application/json\n"
                    + "Server Docker/1.12.0 (linux) is not blacklisted\n"
                    + "Server: Docker/1.12.0 (linux)\n"
                    + "Date: Thu, 29 Sep 2016 20:36:09 GMT\n"
                    + "Content-Length: 310\n"
                    + "\n"
                    + "{\"Processes\":[[\"root\",\"24390\",\"0.0\",\"0.0\",\"18168\",\"3336\",\"pts/15\","
                    + "\"Ss\",\"Sep27\",\"0:00\",\"bin/bash\"],[\"root\",\"25422\",\"0.2\",\"1.0\","
                    + "\"12897260\",\"346996\",\"pts/15\",\"Sl+\",\"Sep27\",\"7:21\",\"java -Dappdynamics "
                    + "-jar IloveJungle.jar\"]],\"Titles\":[\"USER\",\"PID\",\"%CPU\",\"%MEM\",\"VSZ\","
                    + "\"RSS\",\"TTY\",\"STAT\",\"START\",\"TIME\",\"COMMAND\"]}",


            IMAGE1_FOR_IMAGE_URL,
            "HTTP/1.1 200 OK\n"
                    + "Content-Type: application/json\n"
                    + "\n"
                    + "{\n"
                    + "   \"Id\" : \"sha256:85f05633ddc1c50679be2b16a0479ab6f7637f8884e0cfe0f4d20e1ebb3d6e7c\",\n"
                    + "   \"Container\" : \"cb91e48a60d01f1e27028b4fc6819f4f290b3cf12496c8176ec714d0d390984a\",\n"
                    + "   \"Comment\" : \"\",\n"
                    + "   \"Os\" : \"linux\",\n"
                    + "   \"Architecture\" : \"amd64\",\n"
                    + "   \"Parent\" : \"sha256:91e54dfb11794fad694460162bf0cb0a4fa710cfa3f60979c177d920813e267c\",\n"
                    + "   \"ContainerConfig\" : {\n"
                    + "      \"Tty\" : false,\n"
                    + "      \"Hostname\" : \"e611e15f9c9d\",\n"
                    + "      \"Volumes\" : null,\n"
                    + "      \"Domainname\" : \"\",\n"
                    + "      \"AttachStdout\" : false,\n"
                    + "      \"PublishService\" : \"\",\n"
                    + "      \"AttachStdin\" : false,\n"
                    + "      \"OpenStdin\" : false,\n"
                    + "      \"StdinOnce\" : false,\n"
                    + "      \"NetworkDisabled\" : false,\n"
                    + "      \"OnBuild\" : [],\n"
                    + "      \"Image\" : \"91e54dfb11794fad694460162bf0cb0a4fa710cfa3f60979c177d920813e267c\",\n"
                    + "      \"User\" : \"\",\n"
                    + "      \"WorkingDir\" : \"\",\n"
                    + "      \"Entrypoint\" : null,\n"
                    + "      \"MacAddress\" : \"\",\n"
                    + "      \"AttachStderr\" : false,\n"
                    + "      \"Labels\" : {\n"
                    + "         \"com.example.license\" : \"GPL\",\n"
                    + "         \"com.example.version\" : \"1.0\",\n"
                    + "         \"com.example.vendor\" : \"Acme\"\n"
                    + "      },\n"
                    + "      \"Env\" : [\n"
                    + "         \"PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin\"\n"
                    + "      ],\n"
                    + "      \"ExposedPorts\" : null,\n"
                    + "      \"Cmd\" : [\n"
                    + "         \"/bin/sh\",\n"
                    + "         \"-c\",\n"
                    + "         \"#(nop) LABEL com.example.vendor=Acme com.example.license=GPL com.example.version=1"
                    + ".0\"\n"
                    + "      ]\n"
                    + "   },\n"
                    + "   \"DockerVersion\" : \"1.9.0-dev\",\n"
                    + "   \"VirtualSize\" : 188359297,\n"
                    + "   \"Size\" : 0,\n"
                    + "   \"Author\" : \"\",\n"
                    + "   \"Created\" : \"2015-09-10T08:30:53.26995814Z\",\n"
                    + "   \"GraphDriver\" : {\n"
                    + "      \"Name\" : \"aufs\",\n"
                    + "      \"Data\" : null\n"
                    + "   },\n"
                    + "   \"RepoDigests\" : [\n"
                    + "      \"localhost:5000/test/busybox/example@sha256"
                    + ":cbbf2f9a99b47fc460d422812b6a5adff7dfee951d8fa2e4a98caa0382cfbdbf\"\n"
                    + "   ],\n"
                    + "   \"RepoTags\" : [\n"
                    + "      \"example:1.0\",\n"
                    + "      \"example:latest\",\n"
                    + "      \"example:stable\"\n"
                    + "   ],\n"
                    + "   \"Config\" : {\n"
                    + "      \"Image\" : \"91e54dfb11794fad694460162bf0cb0a4fa710cfa3f60979c177d920813e267c\",\n"
                    + "      \"NetworkDisabled\" : false,\n"
                    + "      \"OnBuild\" : [],\n"
                    + "      \"StdinOnce\" : false,\n"
                    + "      \"PublishService\" : \"\",\n"
                    + "      \"AttachStdin\" : false,\n"
                    + "      \"OpenStdin\" : false,\n"
                    + "      \"Domainname\" : \"\",\n"
                    + "      \"AttachStdout\" : false,\n"
                    + "      \"Tty\" : false,\n"
                    + "      \"Hostname\" : \"e611e15f9c9d\",\n"
                    + "      \"Volumes\" : null,\n"
                    + "      \"Cmd\" : [\n"
                    + "         \"/bin/bash\"\n"
                    + "      ],\n"
                    + "      \"ExposedPorts\" : null,\n"
                    + "      \"Env\" : [\n"
                    + "         \"PATH=/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin\"\n"
                    + "      ],\n"
                    + "      \"Labels\" : {\n"
                    + "         \"com.example.vendor\" : \"Acme\",\n"
                    + "         \"com.example.version\" : \"1.0\",\n"
                    + "         \"com.example.license\" : \"GPL\"\n"
                    + "      },\n"
                    + "      \"Entrypoint\" : null,\n"
                    + "      \"MacAddress\" : \"\",\n"
                    + "      \"AttachStderr\" : false,\n"
                    + "      \"WorkingDir\" : \"\",\n"
                    + "      \"User\" : \"\"\n"
                    + "   },\n"
                    + "   \"RootFS\": {\n"
                    + "       \"Type\": \"layers\",\n"
                    + "       \"Layers\": [\n"
                    + "           \"sha256:1834950e52ce4d5a88a1bbd131c537f4d0e56d10ff0dd69e66be3b7dfa9df7e6\",\n"
                    + "           \"sha256:5f70bf18a086007016e948b04aed3b82103a36bea41755b6cddfaf10ace3c6ef\"\n"
                    + "       ]\n"
                    + "   }\n"
                    + "}"
    );


    public static String getResponseForUrl(String url) {
        String result =  data.get(url);
        if (result == null)
            result = DEFAULT_STRING_VALUE;
        return result;
    }


    public static String getDataForUrl(String url) {
        String result = getResponseForUrl(url);
        if (!result.equals(DEFAULT_STRING_VALUE)) {
            result = result.substring(Math.min(result.indexOf("{"), result.indexOf("[")));
        }
        return result;
    }

    public static Set<String> listUrls() {
        return data.keySet();
    }
}
