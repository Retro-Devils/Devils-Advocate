.class Lcom/digdroid/alman/dig/k3$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/digdroid/alman/dig/d0$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/k3;->A3(Ljava/lang/String;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:I

.field final synthetic c:Lcom/digdroid/alman/dig/k3;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/k3;Ljava/lang/String;I)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/k3$c;->c:Lcom/digdroid/alman/dig/k3;

    iput-object p2, p0, Lcom/digdroid/alman/dig/k3$c;->a:Ljava/lang/String;

    iput p3, p0, Lcom/digdroid/alman/dig/k3$c;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    iget-object v0, p0, Lcom/digdroid/alman/dig/k3$c;->c:Lcom/digdroid/alman/dig/k3;

    iget-object v1, v0, Lcom/digdroid/alman/dig/p1;->m0:Lcom/digdroid/alman/dig/p1$a;

    invoke-virtual {v0}, Lcom/digdroid/alman/dig/r1;->o3()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/digdroid/alman/dig/k3$c;->a:Ljava/lang/String;

    iget v3, p0, Lcom/digdroid/alman/dig/k3$c;->b:I

    const/4 v4, 0x0

    invoke-interface {v1, v0, v2, v3, v4}, Lcom/digdroid/alman/dig/p1$a;->i0(Ljava/lang/String;Ljava/lang/String;II)V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method
