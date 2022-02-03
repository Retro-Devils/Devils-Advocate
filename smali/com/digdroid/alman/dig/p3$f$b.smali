.class Lcom/digdroid/alman/dig/p3$f$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/digdroid/alman/dig/p3$f;->a([Lcom/digdroid/alman/dig/a4;)Ljava/util/ArrayList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Lcom/digdroid/alman/dig/r3;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/digdroid/alman/dig/p3$f;


# direct methods
.method constructor <init>(Lcom/digdroid/alman/dig/p3$f;)V
    .locals 0

    iput-object p1, p0, Lcom/digdroid/alman/dig/p3$f$b;->a:Lcom/digdroid/alman/dig/p3$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/digdroid/alman/dig/r3;Lcom/digdroid/alman/dig/r3;)I
    .locals 1

    const-string v0, "name"

    invoke-virtual {p1, v0}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, v0}, Lcom/digdroid/alman/dig/n;->i(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/digdroid/alman/dig/r3;

    check-cast p2, Lcom/digdroid/alman/dig/r3;

    invoke-virtual {p0, p1, p2}, Lcom/digdroid/alman/dig/p3$f$b;->a(Lcom/digdroid/alman/dig/r3;Lcom/digdroid/alman/dig/r3;)I

    move-result p1

    return p1
.end method
