# lldpad from openlldp is the agent TSN endpoints use, and both agents
# transmit on the same interface, so only one may start at boot.
SYSTEMD_AUTO_ENABLE ?= "disable"
