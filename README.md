###############################
EMBOUAZZA Fares & LEFEU Clement 
       T2 README JAVA
###############################


Fonctionnalit�s
---------------
Notre projet dispose de nombreuses fonctionnalit�s que nous allons vous d�tailler�:
	-L'utilisateur dispose d'un nom d'utilisateur qu'il entre lors de l�ex�cution du programme. L'interaction avec cette utilisateur restera coh�rent vis � vis de son nom d'utilisateur durant tout le long de l�ex�cution. 
	-L'utilisateur peux interagir avec le programme en y �crivant des mots. Le programme ne r�pond  aux messages de l�utilisateur seulement en cas d'appel pr�cis que nous allons vous lister�: 
		*/ @hello�: appel le bot ��Hello�� r�pondant�: ��Salut <userName>!�� 
		*/ @time�: appel le bot ��Time�� r�pondant�la date et  l'heure actuel. 
		*/ @icndb�: appel le bot ��Icndb�� r�pondant en donnant une citation de Chuck Norris. Ce bot peut prendre un entier en argument correspondant aux nombres de citation qu'il va donner. Ce nombre max de citation est de 10, au-del� de cette limite, le bot n'affiche qu'une seule citation. (de nombreux cas d'exception ont �t� trait�, afin de s'assurer de la validit� de la demande (Exemple�: s'assurer que l'argument est bien un entiers, �))
		*/ @quizz : appel le bot �Quizz� r�pondant � un appel en posant des question � l'utilisateur. Ce bot pose autant de question que l'utilisateur demande et en pose 1 par d�faut lorsque cette argument n'est pas verifi�. Ce bot est capable de donner le score total des bonnes r�ponse � la fin de son appel. Ces questions sont d�termin�e al�atoirement gr�ce � des appels vers une API d�di�. 
		*/ @help : appel le bot �Help�. Ce bot permet lors de son appel, d'afficher tous les bots disponibles. Cela permet � l'utilisateur d'obtenir toutes les informations sur les interactions possibles entre bots.
	-L'utilisateur a acc�s � une interface afin d�interagir avec les bots. Cette interface s'ouvre imm�diatement au lancement du programme. Cette interface est dynamique, elle affiche les messages dans un ordre antichronologique et en commen�ant par le bas. Les messages d�filent vers le haut. (Nous avons pris en compte les cas limites, tel que lorsque l'interface est pleinement rempli de message, les plus ancien se voit supprim�s). 
	-L'utilisateur peux faire appel � certains bot qui interagissent avec cette interface:
		*/ @delete :  appel le bot �Delete�. Ce bot permet lors de son appel, de supprimer le derni�re appel de l'utilisateur ainsi que toutes les r�ponses suivantes donn�es par le bot. 
		*/ @rename : appel le bot �Rename�. Ce bot permet de changer de nom d'utilisateur. 
		*/ @clear : appel le bot �Clean�. Ce bot permet de nettoyer toute l'interface. Autrement dit, il remet l'interface � z�ro en supprimant tous les messages ult�rieurement �crit.



La structure du programme a �t� pens� afin de pouvoir faciliter tout ajout de bot. Nous avons fait le choix d'une architecture dite "Model View Controller" constitu� de trois parties distinctes; Le model qui contient les donn�es � afficher, une vue contenant la pr�sentation de l'interface graphique et enfin, un contr�leur contenant les actions effectu�es par l'utilisateur. Ce processus permet d'organiser au mieux notre programme avec pour chaque partie des r�les et taches pr�cises.



Architecture
------------
src/Main.java : Il s'agit du premiers programme lanc�. Il permet une v�rification des arguments donn�s, � savoir, "-p <userName>" et informe l'utilisateur en cas d'erreur. Il cr�er un UserController puis lance sa m�thode runUser permettant d'initier le programme. 


src/model/Bot.java : Il s'agit du mod�le g�n�ral des bots. Tous les bots d�coulent de cette structure (Ils h�ritent tous de Bot). 
src/model/HelloBot.java : Cette classe est le mod�le du Bot Hello.
src/model/HelpBot.java : Cette classe est le mod�le du Bot Help.
src/model/RenameBot.java : Cette classe est le mod�le du Bot Rename.
src/model/IcndbBot.java : Cette classe est le mod�le du Bot Icndb.
src/model/JsonModel.java : Cette permet d'�tablir une connexion avec une API en y r�cup�rant le JSON li�.
src/model/QuizzBot.java : Cette classe est le mod�le du Bot Quizz.
src/model/SystemBot.java : Cette classe est le mod�le du Bot System.
src/model/TimeBot.java : Cette classe est le mod�le du Bot Time.
src/model/User.java : Cette classe est le mod�le de l'utilisateur, l'argument est le nom.

src/view/Terminal.java : Cette classe permet d'�tablir la liaison vers l'interface. Elle h�rite donc de cette derni�re. 
src/view/Windows.java : Cette classe g�re l'affichage et les modifications de l'int�rface.

src/controller/BotController.java : Le BotController est le contr�leur commun � tous les bots, il permet de lancer la m�thode launch directement.
src/controller/DeleteController.java : Le DeleteController sert de contr�leur lorsque l'utilisateur appelle le bot Delete.
src/controller/ClearController.java : Le ClearController sert de contr�leur lorsque l'utilisateur appelle le bot Clear.
src/controller/HelloController.java : Le HelloController sert de contr�leur lorsque l'utilisateur appelle le bot Hello.
src/controller/HelpController.java : Le HelpController sert de contr�leur lorsque l'utilisateur appelle le bot Help.
src/controller/IcndbController.java : Le IcndbController sert de contr�leur lorsque l'utilisateur appelle le bot Icndb.
src/controller/LaunchController.java : Le LaunchController contr�le la cr�ation du Hashmap li� aux bots. Il initie et lance les bots.
src/controller/QuizzController.java : Le QuizzController sert de contr�leur lorsque l'utilisateur appelle le bot Quizz.
src/controller/RenameController.java : Le RenameController sert de contr�leur lorsque l'utilisateur appelle le bot Rename.
src/controller/SystemController.java : Le SystemController contr�le l�interaction avec le bot System qui intervient lorsque le bot appel� est inconnu.
src/controller/TimeController.java : Le TimeController sert de contr�leur lorsque l'utilisateur appelle le bot Time.
src/controller/UserController.java : Le UserController contr�le l�interaction entre l'affichage et l'utilisateur.

...