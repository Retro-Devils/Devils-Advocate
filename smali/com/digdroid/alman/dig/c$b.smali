.class Lcom/digdroid/alman/dig/c$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lc/a/c/p$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/c;->r1()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lc/a/c/p$b<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/c;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/c;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/c$b;->a:Lcom/digdroid/alman/dig/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/digdroid/alman/dig/c$b;->b(Ljava/lang/String;)V

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    if-eqz p1, :cond_0

    iget-object v0, p0, Lcom/digdroid/alman/dig/c$b;->a:Lcom/digdroid/alman/dig/c;

    invoke-virtual {v0, p1}, Lcom/digdroid/alman/dig/c;->e3(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
