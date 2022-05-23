
<h1>Installing Kubernetes on a Linux machine</h1>

Selecting a virtualization software: we recommend using VirtualBox. 
You need at least 2 CPUs, 4GB RAM

We recommend using the Ubuntu Server Linux distribution. You can download the image for free here: https://ubuntu.com/download/server

Remember during the installation, when asked about the disk partition options, to select the manual setup and to not create a swap partition.

<h2>Installing Docker</h2>

There are several ways to install Docker. One of the ways is using a tool called snap. However, we learned that the installation through snap sometimes does not work well with Kubernetes. Therefore, we recommend the installation procedure that sets up the Docker repository in apt. The process can be found here: https://docs.docker.com/engine/install/ubuntu/#install-using-the-repository

At this stage, it is important to configure Docker to use the systemd for the management of the container’s cgroups. This can be done by following the steps here: https://kubernetes.io/docs/setup/production-environment/container-runtimes/#docker

<h2>Installing Kubernetes</h2>

The installation procedures for Kubernetes can be found here: https://kubernetes.io/docs/setup/production-environment/tools/kubeadm/install-kubeadm/
Remember that you can skip the Installing runtime part since we already installed Docker in the previous step.

When you get to the part Configuring a cgroup driver make sure to follow the steps related to the systemd driver.

When you get to the part Creating a cluster with kubeadm, make sure to run kubeadm init with the arguments described https://github.com/flannel-io/flannel/blob/master/Documentation/kubernetes.md.
This will make sure that the network fabric will work correctly.

Important considerations after installing Kubernetes

Some Kubernetes installations may require a layer 3 fabric. Flannel is the one recommended. Installation procedures can be found in https://github.com/flannel-io/flannel#deploying-flannel-manually. 
In short, it is enough to run kubectl apply -f https://raw.githubusercontent.com/coreos/flannel/master/Documentation/kube-flannel.yml.

If you want to run containers in the same machine that is the Kubernetes main machine, you need to enable it by using the procedure available here.

If you are sharing this Kubernetes installation among different applications, it is a good practice to create a namespace for each application, e.g., teraflow. This can be done using this official Kubernetes namespaces documentation.

<h2>Validating installation</h2>

To validate your installation, you can run

kubectl get nodes

and your node should show with status Ready.
