var fs = require('fs');

let characters = ["Mario", "Donkey Kong", "Link", "Samus", "Dark Samus", "Yoshi", "Kirby", "Fox", "Pikachu", "Luigi", "Ness", "Captain Falcon", "Jigglypuff", "Peach", "Daisy", "Bowser", "Ice Climbers", "Sheik", "Zelda", "Doctor Mario", "Pichu", "Falco", "Marth", "Lucina", "Young Link", "Ganondorf", "Mewtwo", "Roy", "Chrom", "Mr. Game & Watch", "Meta Knight", "Pit", "Dark Pit", "Zero Suit Samus", "Wario", "Snake", "Ike", "Pokemon Trainer", "Diddy Kong", "Lucas", "Sonic", "King Dedede", "Olimar", "Lucario", "R.O.B.", "Toon Link", "Wolf", "Villager", "Megaman", "Wii Fit Trainer", "Rosalina & Luma", "Little Mac", "Greninja", "Palutena", "Pac-man", "Robin", "Shulk", "Bowser Jr.", "Duck Hunt", "Ryu", "Ken", "Cloud", "Corrin", "Bayonetta", "Inkling", "Ridley", "Simon", "Richter", "King K. Rool", "Isabelle", "Incineroar", "Piranha Plant", "Joker", "Hero", "Banjo & Kazooie", "Terry", "Byleth", "Min-Min", "Steve", "Sephiroth", "Pyra", "Mythra", "Kazuya", "Sora", "Mii Brawler", "Mii Swordfighter", "Mii Gunner"];
let idNames = ["mario", "donkey", "link", "samus", "samusd", "yoshi", "kirby", "fox", "pikachu", "luigi", "ness", "captain", "purin", "peach", "daisy", "koopa", "ice_climber", "sheik", "zelda", "mariod", "pichu", "falco", "marth", "lucina", "younglink", "ganon", "mewtwo", "roy", "chrom", "gamewatch", "metaknight", "pit", "pitb", "szerosuit", "wario", "snake", "ike", "ptrainer", "diddy", "lucas", "sonic", "dedede", "pikmin", "lucario", "robot", "toonlink", "wolf", "murabito", "rockman", "wiifit", "rosetta", "littlemac", "gekkouga", "palutena", "pacman", "reflet", "shulk", "koopajr", "duckhunt", "ryu", "ken", "cloud", "kamui", "bayonetta", "inkling", "ridley", "simon", "richter", "krool", "shizue", "gaogaen", "packun", "jack", "brave", "buddy", "dolly", "master", "tantan", "pickel", "edge", "eflame_only", "elight_only", "demon", "trail", "miifighter", "miiswordsman", "miigunner"];

for(var i=0; i<characters.length; i++)
{
	for(var j=0; j<8; j++)
	{
		fs.rename('chara_6_'+idNames[i]+'_0'+j+".png", characters[i]+(j+1)+".png", function(err)
		{
		    if ( err ) console.log('ERROR: ' + err);
		});
	}
}
