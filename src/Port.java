/*
Defines a port for PortScanner
Contains:
    - int value for port number
    - String value for port Description
    - Status (open/close) -> Allows for a single list
    - Potentially Response time
 */
public class Port {
    private int portNumber;
    private String description;
    private boolean status;
    private double responseTime;

    public Port(int portNumber, boolean status) {
        this.portNumber = portNumber;
        this.status = status;
    }
    public boolean getisOpen(){
        return status;
    }



    @Override
    public String toString() {
        String result = "";
        String getStatus;
        if (status) {
            getStatus = "Open";
            result = "Port " + portNumber + " " + getPortDescription(portNumber) + ". Status: " + getStatus;
        } else {
            getStatus = "Closed";
        }
        
        return result;
    }

    public String getPortDescription(int port){
            description = switch (port) {
            case 1 -> "TCP Port Service Multiplexer (TCPMUX)";
            case 2 -> "CompressNET Management Utility";
            case 3 -> "CompressNET Compression Process";
            case 5 -> "Remote job entry";
            case 7 -> "Echo Protocol";
            case 9 -> "Discard Protocol";
            case 11 -> "Active Users (systat service)";
            case 13 -> "Daytime Protocol (RFC 867)";
            case 17 -> "Quote Of The Day";
            case 19 -> "Character Generator Protocol";
            case 20 -> "FTP data transfer";
            case 21 -> "FTP control (command)";
            case 22 -> "Secure Shell (SSH), secure logins, file transfers (SCP, SFTP)";
            case 23 -> "Telnet protocol - unencrypted text communications";
            case 24 -> "Priv-mail, any private mail system";
            case 25 -> "Simple Mail Transfer Protocol (SMTP)";
            case 27 -> "NSW User System FE";
            case 29 -> "MSG ICP";
            case 33 -> "Display Support Protocol";
            case 35 -> "Any private printer server protocol";
            case 37 -> "Time Protocol";
            case 39 -> "Resource Location Protocol (RLP)";
            case 42 -> "ARPA Host Name Server Protocol";
            case 43 -> "WHOIS protocol";
            case 47 -> "NI FTP";
            case 49 -> "TACACS+ Login Host protocol";
            case 50 -> "Remote Mail Checking Protocol";
            case 51 -> "IMP Logical Address Maintenance";
            case 52 -> "XNS (Xerox Network Systems) Time Protocol";
            case 53 -> "Domain Name System (DNS)";
            case 54 -> "Xerox Network Systems (XNS) clearinghouse";
            case 55 -> "ISI Graphics Language (ISI-GL)";
            case 56 -> "Xerox Network Systems (XNS) authentication";
            case 57 -> "Any private terminal access";
            case 58 -> "Xerox Network Systems (XNS) Mail";
            case 64 -> "CI (Travelport) (formerly Covia) Comms Integrator";
            case 67 -> "Bootstrap Protocol (BOOTP) server or Dynamic Host Configuration Protocol (DHCP)";
            case 68 -> "Bootstrap Protocol (BOOTP) client or Dynamic Host Configuration Protocol (DHCP)";
            case 69 -> "Trivial File Transfer Protocol (TFTP)";
            case 70 -> "Gopher protocol";
            case 71 -> "NETRJS protocol";
            case 72 -> "NETRJS protocol";
            case 73 -> "NETRJS protocol";
            case 74 -> "NETRJS protocol";
            case 77 -> "Any private Remote job entry";
            case 79 -> "Finger protocol";
            case 80 -> "Hypertext Transfer Protocol (HTTP)";
            case 88 -> "Kerberos authentication system";
            case 90 -> "DNSIX Security Attribute Token Map";
            case 101 -> "NIC host name";
            case 102 -> "ISO Transport Service Access Point (TSAP)";
            case 104 -> "ACR/NEMA Digital Imaging and Communications in Medicine (DICOM)";
            case 105 -> "CCSO Nameserver Protocol (Qi/Ph)";
            case 107 -> "Remote Telnet Service protocol";
            case 108 -> "SNA Gateway Access Server";
            case 109 -> "Post Office Protocol v2 (POP2)";
            case 110 -> "Post Office Protocol v3 (POP3)";
            case 111 -> "ONC RPC (Sun RPC)";
            case 113 -> "Ident, authentication service/identification protocol";
            case 115 -> "Simple File Transfer Protocol";
            case 118 -> "Structured Query Language (SQL) Services";
            case 119 -> "Network News Transfer Protocol (NNTP)";
            case 123 -> "Network Time Protocol (NTP)";
            case 126 -> "Formerly Unisys Unitary Login, renamed by Unisys to NXEdit";
            case 135 -> "DCE endpoint resolution";
            case 137 -> "NetBIOS Name Service";
            case 138 -> "NetBIOS Datagram Service";
            case 139 -> "NetBIOS Session Service";
            case 143 -> "Internet Message Access Protocol (IMAP)";
            case 152 -> "Background File Transfer Program (BFTP)";
            case 153 -> "Simple Gateway Monitoring Protocol (SGMP)";
            case 156 -> "SQL Service";
            case 162 -> "Simple Network Management Protocol Trap (SNMPTRAP)";
            case 170 -> "Print-srv, Network PostScript";
            case 175 -> "VMNET (IBM z/VM, z/OS & z/VSE—Network Job Entry (NJE))";
            case 177 -> "X Display Manager Control Protocol (XDMCP)";
            case 179 -> "Border Gateway Protocol (BGP)";
            case 194 -> "Internet Relay Chat (IRC)";
            case 199 -> "SMUX, SNMP Unix Multiplexer";
            case 201 -> "AppleTalk Routing Maintenance";
            case 209 -> "Quick Mail Transfer Protocol";
            case 210 -> "ANSI Z39.50";
            case 213 -> "Internetwork Packet Exchange (IPX)";
            case 218 -> "Message posting protocol (MPP)";
            case 220 -> "Internet Message Access Protocol (IMAP), version 3";
            case 259 -> "Efficient Short Remote Operations (ESRO)";
            case 262 -> "Arcisdms";
            case 264 -> "Border Gateway Multicast Protocol (BGMP)";
            case 280 -> "http-mgmt";
            case 308 -> "Novastor Online Backup";
            case 311 -> "Mac OS X Server Admin";
            case 318 -> "PKIX Time Stamp Protocol (TSP)";
            case 350 -> "Mapping of Airline Traffic over Internet Protocol (MATIP) type A";
            case 351 -> "Mapping of Airline Traffic over Internet Protocol (MATIP) type B";
            case 356 -> "cloanto-net-1 (used by Cloanto Amiga Explorer and VMs)";
            case 366 -> "On-Demand Mail Relay (ODMR)";
            case 369 -> "Rpc2portmap";
            case 370 -> "codaauth2, Coda authentication server";
            case 371 -> "ClearCase albd";
            case 383 -> "HP data alarm manager";
            case 384 -> "A Remote Network Server System";
            case 387 -> "AURP (AppleTalk Update-based Routing Protocol)[22]";
            case 389 -> "Lightweight Directory Access Protocol (LDAP)";
            case 399 -> "Digital Equipment Corporation DECnet (Phase V+) over TCP/IP";
            case 401 -> "Uninterruptible power supply (UPS)";
            case 427 -> "Service Location Protocol (SLP)";
            case 433 -> "NNSP, part of Network News Transfer Protocol";
            case 434 -> "Mobile IP Agent (RFC 5944)";
            case 443 -> "Hypertext Transfer Protocol over TLS/SSL (HTTPS)";
            case 444 -> "Simple Network Paging Protocol (SNPP), RFC 1568";
            case 445 -> "Microsoft-DS Active Directory, Windows shares";
            case 464 -> "Kerberos Change/Set password";
            case 465 -> "URL Rendezvous Directory for SSM (Cisco protocol)";
            case 475 -> "tcpnethaspsrv, Aladdin Knowledge Systems Hasp services";
            case 497 -> "Dantz Retrospect";
            case 500 ->
                    "Internet Security Association and Key Management Protocol (ISAKMP) / Internet Key Exchange (IKE)";
            case 502 -> "Modbus Protocol";
            case 504 -> "Citadel, multiservice protocol for dedicated clients for the Citadel groupware system";
            case 510 -> "FirstClass Protocol (FCP)";
            case 512 -> "Rexec, Remote Process Execution";
            case 513 -> "rlogin";
            case 514 ->
                    "Remote Shell, used to execute non-interactive commands on a remote system (Remote Shell, rsh, remsh)";
            case 515 -> "Line Printer Daemon (LPD), print service";
            case 520 -> "efs, extended file name server";
            case 524 -> "NetWare Core Protocol (NCP)";
            case 530 -> "Remote procedure call (RPC)";
            case 532 -> "netnews";
            case 540 -> "Unix-to-Unix Copy Protocol (UUCP)";
            case 542 -> "commerce (Commerce Applications)";
            case 543 -> "klogin, Kerberos login";
            case 544 -> "kshell, Kerberos Remote shell";
            case 546 -> "DHCPv6 client";
            case 547 -> "DHCPv6 server";
            case 548 -> "Apple Filing Protocol (AFP) over TCP";
            case 550 -> "new-rwho, new-who";
            case 554 -> "Real Time Streaming Protocol (RTSP)";
            case 556 -> "Remotefs, RFS, rfs_server";
            case 563 -> "NNTP over TLS/SSL (NNTPS)";
            case 587 -> "e-mail message submission (SMTP)";
            case 591 -> "FileMaker 6.0 (and later) Web Sharing (HTTP Alternate)";
            case 593 -> "HTTP RPC Ep Map";
            case 601 -> "Reliable Syslog Service";
            case 604 -> "TUNNEL profile";
            case 631 -> "Internet Printing Protocol (IPP)";
            case 635 -> "RLZ DBase";
            case 636 -> "Lightweight Directory Access Protocol over TLS/SSL (LDAPS)";
            case 639 -> "MSDP, Multicast Source Discovery Protocol";
            case 641 -> "SupportSoft Nexus Remote Command (control/listening)";
            case 643 -> "SANity";
            case 646 -> "Label Distribution Protocol (LDP)";
            case 647 -> "DHCP Failover protocol";
            case 648 -> "Registry Registrar Protocol (RRP)";
            case 651 -> "IEEE-MMS";
            case 653 -> "SupportSoft Nexus Remote Command";
            case 654 -> "Media Management System (MMS) Media Management Protocol (MMP)";
            case 657 -> "IBM RMC (Remote monitoring and Control) protocol";
            case 660 -> "Mac OS X Server administration";
            case 674 -> "Application Configuration Access Protocol (ACAP)";
            case 688 -> "REALM-RUSD (ApplianceWare Server Appliance Management Protocol)";
            case 690 -> "Velneo Application Transfer Protocol (VATP)";
            case 691 -> "MS Exchange Routing";
            case 694 -> "Linux-HA high-availability heartbeat";
            case 695 -> "IEEE Media Management System over SSL (IEEE-MMS-SSL)";
            case 700 -> "Extensible Provisioning Protocol (EPP)";
            case 701 -> "Link Management Protocol (LMP)";
            case 702 -> "IRIS (Internet Registry Information Service) over BEEP";
            case 706 -> "Secure Internet Live Conferencing (SILC)";
            case 711 -> "Cisco Tag Distribution Protocol";
            case 712 -> "Topology Broadcast based on Reverse-Path Forwarding routing protocol (TBRPF)";
            case 749 -> "Kerberos (protocol) administration";
            case 753 -> "Reverse Routing Header (RRH)";
            case 754 -> "tell send";
            case 800 -> "mdbs-daemon";
            case 830 -> "NETCONF over SSH";
            case 831 -> "NETCONF over BEEP";
            case 832 -> "NETCONF for SOAP over HTTPS";
            case 833 -> "NETCONF for SOAP over BEEP";
            case 847 -> "DHCP Failover protocol";
            case 848 -> "Group Domain Of Interpretation (GDOI) protocol";
            case 860 -> "iSCSI (RFC 3720)";
            case 861 -> "OWAMP control (RFC 4656)";
            case 862 -> "TWAMP control (RFC 5357)";
            case 873 -> "rsync file synchronization protocol";
            case 902 -> "ideafarm-door (IdeaFarm (tm) Operations)";
            case 903 -> "ideafarm-panic (IdeaFarm (tm) Operations)";
            case 989 -> "FTPS Protocol (data), FTP over TLS/SSL";
            case 990 -> "FTPS Protocol (control), FTP over TLS/SSL";
            case 991 -> "Netnews Administration System (NAS)";
            case 992 -> "Telnet protocol over TLS/SSL";
            case 993 -> "Internet Message Access Protocol over TLS/SSL (IMAPS)";
            case 994 -> "Internet Relay Chat over TLS/SSL (IRCS)";
            case 995 -> "Post Office Protocol 3 over TLS/SSL (POP3S)";
            case 1025 -> "Microsoft RPC";
            case 1080 -> "SOCKS Proxy";
            case 1194 -> "OpenVPN";
            case 1241 -> "Nessus";
            case 1311 -> "Dell OpenManage";
            case 1433 -> "Microsoft SQL";
            case 1434 -> "Microsoft SQL";
            case 1512 -> "WINS";
            case 1589 -> "Cisco VQP";
            case 1701 -> "L2TP";
            case 1723 -> "MS PPTP";
            case 1741 -> "CiscoWorks 2000";
            case 1812 -> "RADIUS";
            case 1813 -> "RADIUS";
            case 1985 -> "Cisco HSRP";
            case 2000 -> "Cisco SCCP";
            case 2002 -> "Cisco ACS";
            case 2049 -> "NFS";
            case 2082 -> "cPanel";
            case 2083 -> "cPanel";
            case 2100 -> "Oracle XDB";
            case 2222 -> "DirectAdmin";
            case 2483 -> "Oracle DB";
            case 2484 -> "Oracle DB";
            case 3050 -> "Interbase DB";
            case 3124 -> "HTTP Proxy";
            case 3128 -> "HTTP Proxy";
            case 3222 -> "GLBP";
            case 3260 -> "iSCSI Target";
            case 3306 -> "MySQL";
            case 3389 -> "Terminal Server";
            case 3689 -> "iTunes";
            case 3690 -> "Subversion";
            case 4333 -> "mSQL";
            case 4664 -> "Google Desktop";
            case 4899 -> "Radmin";
            case 5000 -> "UPnP";
            case 5001 -> "iperf";
            case 5004 -> "RTP";
            case 5005 -> "RTP";
            case 5432 -> "PostgreSQL";
            case 5500 -> "VNC Server";
            case 5631 -> "pcAnywhere";
            case 5632 -> "pcAnywhere";
            case 5800 -> "VNC over HTTP";
            case 6000 -> "X11";
            case 6001 -> "X11";
            case 6129 -> "DameWare";
            case 6566 -> "SANE";
            case 6588 -> "AnalogX";
            case 8080 -> "HTTP Proxy";
            case 8200 -> "VMware Server";
            case 8500 -> "Adobe ColdFusion";
            case 9100 -> "HP JetDirect";
            case 9101 -> "Bacula";
            case 9102 -> "Bacula";
            case 9103 -> "Bacula";
            case 9800 -> "WebDAV";
            case 10000 -> "Webmin";
            case 11371 -> "OpenPGP";
            case 13720 -> "NetBackup";
            case 13721 -> "NetBackup";
            case 19226 -> "AdminSecure";
            case 19638 -> "Ensim";
            case 20000 -> "Usermin";
            case 24800 -> "Synergy";
            default -> "No description";
        };
        return description;
    }
}
