.class Lcom/digdroid/alman/dig/o$i;
.super Lc/a/a/n;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/digdroid/alman/dig/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "i"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lc/a/a/n<",
        "[B>;"
    }
.end annotation


# instance fields
.field private final q:Lc/a/a/p$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc/a/a/p$b<",
            "[B>;"
        }
    .end annotation
.end field

.field private r:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public s:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic t:Lcom/digdroid/alman/dig/o;


# direct methods
.method public constructor <init>(Lcom/digdroid/alman/dig/o;ILjava/lang/String;Lc/a/a/p$b;Lc/a/a/p$a;Ljava/util/HashMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lc/a/a/p$b<",
            "[B>;",
            "Lc/a/a/p$a;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/digdroid/alman/dig/o$i;->t:Lcom/digdroid/alman/dig/o;

    invoke-direct {p0, p2, p3, p5}, Lc/a/a/n;-><init>(ILjava/lang/String;Lc/a/a/p$a;)V

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lc/a/a/n;->L(Z)Lc/a/a/n;

    iput-object p4, p0, Lcom/digdroid/alman/dig/o$i;->q:Lc/a/a/p$b;

    iput-object p6, p0, Lcom/digdroid/alman/dig/o$i;->r:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method protected F(Lc/a/a/k;)Lc/a/a/p;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc/a/a/k;",
            ")",
            "Lc/a/a/p<",
            "[B>;"
        }
    .end annotation

    iget-object v0, p1, Lc/a/a/k;->c:Ljava/util/Map;

    iput-object v0, p0, Lcom/digdroid/alman/dig/o$i;->s:Ljava/util/Map;

    iget-object v0, p1, Lc/a/a/k;->b:[B

    invoke-static {p1}, Lc/a/a/w/g;->c(Lc/a/a/k;)Lc/a/a/b$a;

    move-result-object p1

    invoke-static {v0, p1}, Lc/a/a/p;->c(Ljava/lang/Object;Lc/a/a/b$a;)Lc/a/a/p;

    move-result-object p1

    return-object p1
.end method

.method protected O([B)V
    .locals 1

    iget-object v0, p0, Lcom/digdroid/alman/dig/o$i;->q:Lc/a/a/p$b;

    invoke-interface {v0, p1}, Lc/a/a/p$b;->a(Ljava/lang/Object;)V

    return-void
.end method

.method protected bridge synthetic e(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, [B

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/o$i;->O([B)V

    return-void
.end method

.method protected o()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/digdroid/alman/dig/o$i;->r:Ljava/util/Map;

    return-object v0
.end method
