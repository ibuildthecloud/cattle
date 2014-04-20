#FROM ibuildthecloud/ubuntu-core-base:13.10
FROM cattle/agent
# Remove after dev
RUN rm /etc/apt/apt.conf.d/no-cache
#ADD http://stedolan.github.io/jq/download/linux64/jq /usr/bin/
ADD jq /usr/bin/jq
RUN chmod +x /usr/bin/jq
RUN apt-get update && apt-get install -y curl vim monit dnsmasq
RUN apt-get update && apt-get install -y busybox
RUN apt-get install -y psmisc
RUN apt-get install -y uuid-runtime
ADD startup.sh /startup.sh
CMD ["/startup.sh"]
