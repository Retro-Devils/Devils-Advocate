.class Lcom/digdroid/alman/dig/s$f$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/p3$e;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/s$f$a;->onClick(Landroid/content/DialogInterface;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/s$f$a;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/s$f$a;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/s$f$a$a;->a:Lcom/digdroid/alman/dig/s$f$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/ArrayList;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/digdroid/alman/dig/r3;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lcom/digdroid/alman/dig/s$f$a$a;->a:Lcom/digdroid/alman/dig/s$f$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/s$f$a;->c:Lcom/digdroid/alman/dig/s$f;

    iget-object v0, v0, Lcom/digdroid/alman/dig/s$f;->c:Lcom/digdroid/alman/dig/s;

    const/4 v1, -0x1

    iput v1, v0, Lcom/digdroid/alman/dig/s;->w0:I

    iget-object v0, v0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-interface {v0}, Lcom/digdroid/alman/dig/p1$a;->R()V

    :try_start_0
    iget-object v0, p0, Lcom/digdroid/alman/dig/s$f$a$a;->a:Lcom/digdroid/alman/dig/s$f$a;

    iget-object v0, v0, Lcom/digdroid/alman/dig/s$f$a;->c:Lcom/digdroid/alman/dig/s$f;

    iget-object v0, v0, Lcom/digdroid/alman/dig/s$f;->c:Lcom/digdroid/alman/dig/s;

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/s;->j3(Ljava/util/ArrayList;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-void
.end method
