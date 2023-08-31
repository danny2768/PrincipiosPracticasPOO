class BlackjackGame {
    constructor(numJugadores = 2) {
        this.deck = [];
        this.suits = ['C', 'D', 'H', 'S'];
        this.faceCards = ['J', 'Q', 'K', 'A'];
        this.puntosJugadores = [];

        this.btnNuevo = document.querySelector('#btnNuevo');
        this.btnPedir = document.querySelector('#btnPedir');
        this.btnDetener = document.querySelector('#btnDetener');

        this.divCartasJugadores = document.querySelectorAll('.divCartas');
        this.puntosHTML = document.querySelectorAll('small');

        this.numJugadores = numJugadores;

        this.inicializarJuego();
        this.btnPedir.addEventListener('click', () => this.pedirCartaJugador());
        this.btnDetener.addEventListener('click', () => this.detenerJugador());
        this.btnNuevo.addEventListener('click', () => this.inicializarJuego());
    }

    inicializarJuego() {
        this.deck = this.crearDeck();
        this.puntosJugadores = new Array(this.numJugadores).fill(0);
        this.actualizarPuntos();
        
        this.btnPedir.disabled = false;
        this.btnDetener.disabled = false;

        this.divCartasJugadores.forEach( elem => elem.innerText = '' );
    }

    crearDeck() {
        const deck = [];
        for (let i = 2; i <= 10; i++) {
            for (let suit of this.suits) {
                deck.push(i + suit);
            }
        }
        for (let faceCard of this.faceCards) {
            for (let suit of this.suits) {
                deck.push(faceCard + suit);
            }
        }
        return _.shuffle(deck);
    }

    pedirCarta() {
        if (this.deck.length === 0) {
            throw 'No hay cartas en el deck';
        }
        return this.deck.pop();
    }

    valorCarta(carta) {
        const valor = carta.substring(0, carta.length - 1);
        return (isNaN(valor)) ? (valor === 'A') ? 11 : 10 : valor * 1;
    }

    acumularPuntos(carta, turno) {
        this.puntosJugadores[turno] += this.valorCarta(carta);
        this.actualizarPuntos();
        return this.puntosJugadores[turno];
    }

    actualizarPuntos() {
        this.puntosHTML.forEach((elem, i) => elem.innerText = this.puntosJugadores[i]);
    }

    pedirCartaJugador() {
        const carta = this.pedirCarta();
        const puntos = this.acumularPuntos(carta, 0);
        this.crearCarta(carta, 0);

        if (puntos > 21) {
            this.btnPedir.disabled = true;
            this.btnDetener.disabled = true;
            this.turnoComputadora(puntos);
        } else if (puntos === 21) {
            this.btnPedir.disabled = true;
            this.btnDetener.disabled = true;
            this.turnoComputadora(puntos);
        }
    }

    detenerJugador() {
        this.btnPedir.disabled = true;
        this.btnDetener.disabled = true;
        this.turnoComputadora(this.puntosJugadores[0]);
    }

    crearCarta(carta, turno) {
        const imgCarta = document.createElement('img');
        imgCarta.src = `assets/cartas/${carta}.png`
        imgCarta.classList.add('carta');
        this.divCartasJugadores[turno].append(imgCarta);
    }

    turnoComputadora(minimumPoints) {
        let computerPoints = 0;

        do {
            const carta = this.pedirCarta();
            computerPoints = this.acumularPuntos(carta, this.numJugadores - 1);
            this.crearCarta(carta, this.numJugadores - 1);

        } while ((computerPoints < minimumPoints) && (minimumPoints <= 21));

        this.determinarGanador();
    }

    determinarGanador() {
        setTimeout(() => {
            const [ minimumPoints, computerPoints] = this.puntosJugadores;

            if (computerPoints === minimumPoints) {
                alert('Nadie gana.')
            } else if (minimumPoints > 21) {
                alert('La computadora gana.')
            } else if (computerPoints > 21) {
                alert('Jugador gana.')
            } else {
                alert('Computadora gana.')
            }

        }, 100);
    }
}

const juego = new BlackjackGame();
