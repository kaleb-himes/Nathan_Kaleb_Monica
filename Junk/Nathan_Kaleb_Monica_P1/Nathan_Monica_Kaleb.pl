use warnings;
use Data::Dump;
use Net::MySQL;

my $name        = "<Kaleb>";
my $partner     = "<Nathan>";
my $partner2    = "<Monica>";
my $platform    = "mysql";
my $tablename   = "song_data";

my $class = DBI;
my $dsn = 'dbi:mysql:database=kaleb;host=127.0.0.1';
my $user = '';
my $passwd = '';
my %attr = 
my $dbAwesome = DBI->connect($dsn,$user,$passwd,{AutoCommit=>1,RaiseError=>1,PrintError=>0});

print "Databases Project  submitted by $name, $partner, and $partner2.\n\n";

# Opens the file and assign it to handle FILE
open (FILE, 'unique_tracks.txt');

my @titles = ();
my @artists = ();
my @tag2s = ();
my @tag1s = ();
my $counter0 = 0;
my $counter1 = 0;
my $counter2 = 0;
my $counter3 = 0;
while (<FILE>) {
chomp;

############### REGEX to hack apart the database ##############################
    my ($Tag1, $Tag2, $Artist, $cutTitle) = split("<SEP>");
=pod
    $cutTitle = "zzzzzzzzzzzzzzz" if $cutTitle =~ s/[^[:ascii:]]//g;
    $cutTitle =~ s/[\[\(\{\\\/\+\*=:\`"-].*$//g;
    $cutTitle =~ s/[-\?!\.;&\$¿¡\@%#\|\*_]//g;
    $cutTitle = lc $cutTitle;
	$cutTitle =~ s/feat.*$//g;
=cut
    push(@titles, $cutTitle)&&$counter0++ if $cutTitle!~"zzzzzzzzzzzzzzz";

=pod
    $Artist = "zzzzzzzzzzzzzzz" if $Artist =~ s/[^[:ascii:]]//g;
    $Artist =~ s/[\[\(\{\\\/\+\*=:\`"-].*$//g;
    $Artist =~ s/[-\?!\.;&\$¿¡\@%#\|\*_]//g;
    $Artist = lc $Artist;
    $Artist =~ s/feat.*$//g;
=cut
    push(@artists, $Artist)&&$counter1++ if $Artist!~"zzzzzzzzzzzzzzz";

=pod
    $Tag2 = "zzzzzzzzzzzzzzz" if $Tag2 =~ s/[^[:ascii:]]//g;
    $Tag2 =~ s/[\[\(\{\\\/\+\*=:\`"-].*$//g;
    $Tag2 =~ s/[-\?!\.;&\$¿¡\@%#\|\*_]//g;
    $Tag2 = lc $Tag2;
    $Tag2 =~ s/feat.*$//g;
=cut
    push(@tag2s, $Tag2)&&$counter2++ if $Tag2!~"zzzzzzzzzzzzzzz";

=pod    
    $Tag1 = "zzzzzzzzzzzzzzz" if $Tag1 =~ s/[^[:ascii:]]//g;
    $Tag1 =~ s/[\[\(\{\\\/\+\*=:\`"-].*$//g;
    $Tag1 =~ s/[-\?!\.;&\$¿¡\@%#\|\*_]//g;
    $Tag1 = lc $Tag1;
    $Tag1 =~ s/feat.*$//g;
=cut
    push(@tag1s, $Tag1)&&$counter3++ if $Tag1!~"zzzzzzzzzzzzzzz";
############### END REGEX #####################################################
}
close (FILE);
print "closed the file\n";

######### Set sizes of the arrays #############################################
my $size_of_titles = @titles;
print "size of titles array: " . $size_of_titles . "\n";
print "counter 0 = " . $counter0 . "\n";

my $size_of_artists = @artists;
print "size of artist array: " . $size_of_artists . "\n";
print "counter 1 = " . $counter1 . "\n";

my $size_of_tag2s = @tag2s;
print "size of tag2 array: " . $size_of_tag2s . "\n";
print "counter 2 = " . $counter2 . "\n";

my $size_of_tag1s = @tag1s;
print "size of tag1 array: " . $size_of_tag1s . "\n";
print "counter 3 = " . $counter3 . "\n";
######## End set sizes ########################################################

#for loop for printing out titles
for (my $i=0; $i < 10; $i++) {

    print "title: " . $titles[$i] . "\n";
}

