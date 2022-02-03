.class public final Landroidx/core/content/c/c$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/core/content/c/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/core/content/c/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation


# instance fields
.field private final a:Lb/g/h/a;

.field private final b:I

.field private final c:I


# direct methods
.method public constructor <init>(Lb/g/h/a;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/core/content/c/c$d;->a:Lb/g/h/a;

    iput p2, p0, Landroidx/core/content/c/c$d;->c:I

    iput p3, p0, Landroidx/core/content/c/c$d;->b:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Landroidx/core/content/c/c$d;->c:I

    return v0
.end method

.method public b()Lb/g/h/a;
    .locals 1

    iget-object v0, p0, Landroidx/core/content/c/c$d;->a:Lb/g/h/a;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Landroidx/core/content/c/c$d;->b:I

    return v0
.end method
